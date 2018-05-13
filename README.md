Forecasting Methods: \n
Most of the forecasting methods take integer day (0 = today, 1 = tomorrow, etc.) and string location ("Seattle, Washington") as arguments. Integer day has to equal the number of days into the future that you want to forecast.

currentTemp(location):
Returns the current temperature at the given location.

condition(day,location):
Returns condition text for the given day and location. Possible return: ("stormy").

high(day,location):
Returns an integer representing the high for a given day and location in imperial units. Possible return: (10).

low(day,location):
Returns an integer representing the low for a given day and location in imperial units. Possible return: (70).

Wind Methods:
All of the wind methods require a string location as an argument (ex: "Seattle, Washington).

windspeed(location):
Returns an integer representing the windspeed for a given location in imperial units. Possible return: (30).

windDirection(location):
Returns an integer representing the wind direction for a given location. Possible return: (5).

windChill(location):
Returns an integer representing the windchill for a given location. Possible return: (30).

Atmosphere Methods:
All of the atmosphere methods require a string location as an argument (ex: "Seattle, Washington").

humidity(location):
Returns an integer representing the humidity for a given location.

pressure(location):
Returns an integer representing the humidity for a given location.

visibility(location):
Returns an integer representing the visibility in miles for a given location.

Astronomy Methods:
All of the astronomy methods require a string location as an argument (ex: "Seattle, Washington")

sunrise(location):
Returns a string containing today's sunrise time.

sunset(location):
Returns a string containing today's sunset time.

List of all methods:
currentTemp(location)
condition(day,location)
high(day,location)
low(day,location)
windspeed(location)
windDirection(location)
windChill(location)
humidity(location)
pressure(location)
visibility(location)
sunset(location)
sunrise(location)
getUnits(location)
