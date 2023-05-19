Feature: Profile page features

  Scenario: Search a track
    Given launch url "https://open.spotify.com/" and login using email "motewaraditya77@gmail.com" and password "Aditya@4629"
    Then verify the title "Spotify - Web Player: Music for everyone"
    Then close driver