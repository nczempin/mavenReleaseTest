# Maven Release Test

## Table of Contents
- [What Problem Does This Solve?](#what-problem-does-this-solve)
- [Who Is This For?](#who-is-this-for)
- [Current Implementation Status](#current-implementation-status)
- [Setup Instructions](#setup-instructions)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
  - [Performing a Release](#performing-a-release)
- [Project Scope](#project-scope)
  - [What This IS](#what-this-is)
  - [What This IS NOT](#what-this-is-not)
- [Repository Structure](#repository-structure)
- [Maven Release Configuration](#maven-release-configuration)
- [Development Status](#development-status)
## What Problem Does This Solve?
Maven Release Test is a demonstration project that showcases the Maven Release Plugin workflow and configuration. It provides a practical example of how to set up and use Maven's release process for versioning, tagging, and deploying Java applications. This project helps developers understand and implement proper release management practices in their own Maven projects.

## Who Is This For?
- Java developers working with Maven build systems
- DevOps engineers setting up CI/CD pipelines
- Teams implementing versioning and release strategies
- Developers learning about Maven release processes

## Current Implementation Status
- ✅ Basic Maven project structure
- ✅ Maven Release Plugin configuration
- ✅ SCM (Source Control Management) integration
- ✅ Distribution management setup
- ✅ Simple Java application for testing
- 🚧 Automated release workflow
- 📋 Release documentation and examples
- 📋 Integration with CI/CD systems

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven 3.3 or higher
- Git for version control
- Access to deployment repositories (for actual releases)

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/nczempin/mavenReleaseTest.git
   cd mavenReleaseTest
   ```

2. Build the project:
   ```
   mvn clean install
   ```

### Running the Application
1. Execute the main class:
   ```
   mvn exec:java
   ```

### Performing a Release
1. Prepare the release:
   ```
   mvn release:prepare
   ```

2. Perform the release:
   ```
   mvn release:perform
   ```

## Project Scope

### What This IS
- A demonstration of Maven Release Plugin configuration
- A template for setting up proper release management
- An educational project for Maven release processes
- A reference implementation for SCM integration

### What This IS NOT
- Not a production application with business functionality
- Not a comprehensive build system example
- Not intended for end users
- Not a Maven plugin or extension

## Repository Structure
- `src/main/java/` - Simple Java application code
  - `de/czempin/Main.java` - Main application class
- `src/test/java/` - Test classes
  - `de/czempin/AppTest.java` - Basic unit tests
- `src/main/resources/` - Application resources
  - `test.properties` - Example properties file
- `pom.xml` - Maven project configuration with release plugin setup

## Maven Release Configuration
The project demonstrates these key release configurations:
- SCM connection to GitHub repository
- Version management (currently at 1.2.2-SNAPSHOT)
- Distribution management for releases and snapshots
- Resource filtering for version information

## Development Status
This is an educational project demonstrating Maven release processes. It serves as a reference implementation and testing ground for release workflows.
