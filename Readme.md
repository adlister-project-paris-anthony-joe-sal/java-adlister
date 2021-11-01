Tuesday, October 26, 2021

Group 5:
Anthony Villegas
Paris Shirley
Salvador Salazar
Joseph Congdon

Agreed on the layout of adlister_db.

tables consist of ads, users, categories and ad_categories. Columns for individual tables listed in the db.

Tested to see if all devs were working on the same repository.
Success

Tested that all devs had working Tomcat server.
Success

Tested to see if all pom files were up-to-date and Maven refreshed. 
Success

Tested to see if all gitignore files had Config.java.
Success

Tested to see if all devs had java functionality.
Success


Created adlister_db

Started wire frame (rough draft)

agreed on page layout and features for site: home, user account page, edit ads, add ads, delete.

Started giving out feature code responsibilities to devs of group 5.

notes taken from github kanban table

The Logic as it stands MVP

Requirements for mvp are as follows:

1.logged in users can view their profile
2.can fully CRUD ads
3.can register new users
4.ad searching and (or) sorting implemented 
5.at least two of the following features added:
6.nav bar changes based on login / logout
7.sticky forms
8.ad show/details page
9.a many-to-many relationship in the application
10.at least one of the following features added:
back end validation of form data error messages
11.intended redirects
12.project styling/grid layout (optional)

The collected data in question are for users of our app and the ads.
This information is contained in the adlister_db labeled in the tables users and ads
each table contains rows contains specific information pertaining to the table in question

in the users table:
id
username
first_name
last_name
email
password
zip_code
phone_number

in the ad table:
id
user_id
title
description
sate_created

Our group did create a categories table that is currently inactive. We hope to have a many-to-many relationship with this table because an add can have multiple categories.





