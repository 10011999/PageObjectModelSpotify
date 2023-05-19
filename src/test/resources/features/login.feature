Feature: Login in Spotify
  Scenario: Login to Spotify application
    Given launch url "https://open.spotify.com/"
    When click on Login button
    And Enter email "motewaraditya77@gmail.com" and password "Aditya@4629"
    Then verify login page title "Login - Spotify"
    Then login and redirect to homepage
    Then login page close driver