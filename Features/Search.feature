
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Search the keyword duck
  Given user launch Chrome browser
	When User opens URL "https://www.google.com"
	And User enters "duck" in search text box
	And click search
	Then User can view results page
	
	
	
	