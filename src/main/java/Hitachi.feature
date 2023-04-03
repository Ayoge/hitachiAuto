@Hitachi
Feature: Navigate to home page


@launch
Scenario:  User can successfully navigate to the site using Chrome browser
 Given Open the Chrome browser and launch the application
 Then Home page should be launched


#Scenario:  User can successfully navigate to the site using Firefox browser
#Given Open the Firefox browser and launch the application
#When Enter the Site Url
#Then Home page should be launched
#
#
#Scenario:  User can successfully navigate to the site using IE browser
#Given Open the IE browser and launch the application
#When Enter the Site Url
#Then Home page should be launched


    @Search
    Scenario: Search Results page is displayed on Blank  keyword Search
      Given Open the Chrome browser and launch the application
      When Click the Search Icon with Blank Keyword
      Then Search Results Page should be displayed


  @Searchwithkeyword
  Scenario: Search Results page is displayed on valid keyword Search
    Given Open the Chrome browser and launch the application
    When Enter a valid keyword and click the search icon
    Then Search Results Page should be displayed with valid keyword
    Then Validate if URL has the right keyword
    Then Click the returned Search result snd verify if the user is able to navigate to respective pages


