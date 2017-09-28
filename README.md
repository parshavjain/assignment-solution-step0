## Seed code - Boilerplate for step 0 - Database Engine Assignment

### Problem Statement

In this assignment, all you need to do is to take a sentence as user input and display the number of words in it.

### STEP 0 - Splitting a String into words and display the word count

Please note that the End User interacting with this utility will give out any sentence and would expect the system to respond with the number of words present in that sentence. For Instance,

Input: **This is a sample string**

Sample Data: 

No. of words: 5


Input: **""**(Empty String)

Sample Data: 

No. of words: 0



-----------


### Expected solution

Displaying **no. of words** in the given string

### Project structure

The folders and files you see in this repositories, is how it is expected to be in projects, which are submitted for automated evaluation by Hobbes

	Project
	|
	├── data 			        // If project needs any data file, it can be found here/placed here, if data is huge they can be mounted, no need put it in your repository
	|
	├── com.stackroute.datamunger	    // all your java file will be stored in this package
	|	└── DataMunger.java	            // This is the main file, all your logic is written in this file only
	├── com.stackroute.datamunger.test // all your test cases will be stored in this package
	|	└── DataMungerTest.java	        // all your test cases are written using JUnit, these test cases can be run by selecting Run As -> JUnit Test 
	|
	├── .classpath			        // This file is generated automatically while creating the project in eclipse
	|
	├── .hobbes   			        // Hobbes specific config options, such as type of evaluation schema, type of tech stack etc., Have saved a default values for convenience
	|
	├── .project			            // This is automatically generated by eclipse, if this file is removed your eclipse will not recognize this as your eclipse project. 
	|
	└── pom.xml 			            // This is a default file generated by maven, if this file is removed your project will not get recognised in hobbes.
	
> PS: All lint rule files are by default copied during the evaluation process, however if need to be customizing, you should copy from this repo and modify in your project repo


#### To use this as a boilerplate for your new project, you can follow these steps

1. Clone the base boilerplate in the folder **assignment-solution-step0** of your local machine
     
    `git clone https://gitlab.training.com/stack_java_datamunging/datamungee-step0-boilerplate.git assignment-solution-step0`

2. Navigate to assignment-solution-step0 folder

    `cd assignment-solution-step0`

3. Remove its remote or original reference

     `git remote rm origin`

4. Create a new repo in gitlab named `assignment-solution-step0` as private repo

5. Add your new repository reference as remote

     `git remote add origin https://gitlab.training.com/{{yourusername}}/assignment-solution-step0.git`

     **Note: {{yourusername}} should be replaced by your username from gitlab**

5. Check the status of your repo 
     
     `git status`

6. Use the following command to update the index using the current content found in the working tree, to prepare the content staged for the next commit.

     `git add .`
 
7. Commit and Push the project to git

     `git commit -a -m "Initial commit | or place your comments according to your need"`

     `git push -u origin master`

8. Check on the git repo online, if the files have been pushed

### Important instructions for Participants
> - We expect you to write the assignment on your own by following through the guidelines, learning plan, and the practice exercises
> - The code must not be plagirized, the mentors will randomly pick the submissions and may ask you to explain the solution
> - The code must be properly indented, code structure maintained as per the boilerplate and properly commented
> - Follow through the problem statement shared with you

### Further Instructions on Release

*** Release 0.1.0 ***

- Right click on the Assignment select Run As -> Java Application to run your Assignment.
- Right click on the Assignment select Run As -> JUnit Test to run your Assignment.