# Museum Management System

## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [UML Class Diagram](#uml-class-diagram)
4. [Class Descriptions](#class-descriptions)
   - [Museum](#museum)
   - [Exhibit](#exhibit)
   - [Ticket](#ticket)
   - [Visitor](#visitor)
5. [Use Cases](#use-cases)
6. [new feature](#new-feature)

## Introduction
The **Museum Management System** is designed to help museum staff manage various aspects of daily operations, including exhibits, ticketing, and visitor information. It provides an organized and modular structure that can be extended with new features.

## Features
- Add, update, and remove exhibits
- Issue and track tickets
- Register and manage visitors

## UML Class Diagram
```text
+------------------------+      1      *    +------------------+
|        Museum         |----------------->|     Exhibit      |
+------------------------+                 +------------------+
| - name: String        |                 | - id: int        |
| - location: String    |                 | - title: String  |
| - exhibits: List<Exhibit> |             | - description: String |
+------------------------+                 +------------------+
| + addExhibit()        |                 | + getDetails()   |
| + removeExhibit()     |                 +------------------+
| + listExhibits()      |
+------------------------+
         |
         | 1                          *
         v
+------------------------+                 +------------------+
|        Visitor        |1               * |      Ticket      |
+------------------------+---------------->-+------------------+
| - id: int              |                 | - ticketId: int  |
| - name: String         |                 | - exhibitId: int |
| - email: String        |                 | - price: double  |
+------------------------+                 +------------------+
| + register()           |                 | + issue()        |
| + viewTickets()        |                 +------------------+
+------------------------+
