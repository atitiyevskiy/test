import urllib, urllib2, sys, json, cookielib

max = int(sys.argv[1])
centr = ['230', '231', '232', '201', '202', '203', '214', '215', '216', '217', '218', '219']
corner = ['227', '228', '229', '204', '205', '206', '211', '212', '213', '220', '221', '222']
baseline = ['223', '224', '225', '226', '207', '208', '209', '210']
url = 'http://www.ticketmaster.com'
cookieJar = cookielib.CookieJar()
opener = urllib2.build_opener(urllib2.HTTPCookieProcessor(cookieJar))
connection = opener.open(url)
connection.close()
url = 'http://www.ticketmaster.com/json/resale?command=get_resale_listings&event_id=1C004E6CEC058E57'
connection = opener.open(url)
jsonDict = json.loads(connection.read())
connection.close()
listings = jsonDict['listings']
print '++++++++++++++++++'
for listing in listings:
	price = listing['total']
	quantity = listing['qtyAvailable']
	section = listing['section']
	if section in centr:
		secname = 'CENTR'
	elif section in corner:
		secname = 'CORNER'
	elif section in baseline:
		secname = 'BASELINE'
	if price<max and quantity>=2:
		print 'price: '+str(price)
		print 'section: '+section+' - '+secname
		print 'row: '+listing['row']
		print 'quantity: '+str(quantity)
		print '++++++++++++++++++'
print 'done'