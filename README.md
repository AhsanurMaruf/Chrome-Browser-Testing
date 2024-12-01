
https://github.com/user-attachments/assets/e71ce797-92a1-44a9-a7da-4d333dc6f817

# Install Selenium WebDriver and Use TestNG to Test Any Website

This repository provides a step-by-step guide to install **Selenium WebDriver** and configure **TestNG** in Eclipse IDE for automating website testing. Selenium WebDriver is a powerful tool for browser automation, enabling you to simulate user interactions with a browser.

---

## Table of Contents

1. [Introduction to Selenium WebDriver](#introduction-to-selenium-webdriver)  
2. [Objective](#objective)  
3. [Prerequisites](#prerequisites)  
4. [Step-by-Step Instructions](#step-by-step-instructions)  
   - [Step 1: Setup Eclipse IDE](#step-1-setup-eclipse-ide)  
   - [Step 2: Create a Maven Project](#step-2-create-a-maven-project)  
5. [License](#license)

---

## Introduction to Selenium WebDriver

If you are starting with test automation for desktop or mobile websites, **Selenium WebDriver** is your go-to tool. It utilizes browser automation APIs provided by browser vendors, enabling you to control browsers and execute tests as if a real user were operating the browser.

### Key Features:
- **Non-intrusive**: WebDriver APIs do not require compilation with application code.
- **Real Application Testing**: Test the exact application that will be deployed live.

Selenium is widely used for automated testing due to its flexibility and efficiency.

---

## Objective

To provide a **step-by-step guide** for:
1. Installing **Selenium WebDriver** in Eclipse IDE using Maven.
2. Configuring **TestNG** for creating and executing test cases.

---

## Prerequisites

Before starting, ensure the following are installed and set up:

- **Java JDK**: Download and install the Java Development Kit (JDK) appropriate for your system.
- **Eclipse IDE**: Download and install [Eclipse IDE](https://www.eclipse.org/downloads/).
- **Maven**: Ensure Maven is installed or configured within Eclipse.

---

## Step-by-Step Instructions

### Step 1: Setup Eclipse IDE

1. Open **Eclipse IDE**.  
2. Choose a workspace directory for your project and click **Launch**.  

### Step 2: Create a Maven Project in Eclipse

1. Navigate to `File > New > Project`.  
2. Select **Maven Project** and click **Next**.  
3. If prompted, select **Create a simple project (skip archetype selection)** and click **Next**.  
4. Fill in the project details:
   - **Group Id**: `testNG`
   - **Artifact Id**: `signupTest`
   - **Version**: Leave the default value.  

5. Click **Finish** to create the project.

### Step 3: Add Selenium and TestNG Dependencies  

1. Open the `pom.xml` file in your Maven project.  
2. Add the following dependencies to include Selenium and TestNG:  

   ```xml
   <dependencies>
       <!-- Selenium WebDriver -->
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.11.0</version>
       </dependency>

       <!-- TestNG -->
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.9.0</version>
           <scope>test</scope>
       </dependency>
   </dependencies>
