---
  layout: default.md
  title: "User Guide"
  pageNav: 3
---

# FreelanceBuddy User Guide

## Getting Started

<html><span style="font-size:32px">Attention, full-time freelancers!</span></html>

**FreelanceBuddy** is a **powerful and efficient Command Line Interface (CLI)** optimized app designed **just for you**!

It's your **one-stop solution** for <span style="color:#a30039">managing multiple clients</span>, staying on top of your <span style="color:#02bd5c">financial reports</span> and <span style="color:#7725fa">keeping track of your meetings</span> with ease.

If you are a freelancer who is looking to optimize your workflow, look no further! FreelanceBuddy might just be the buddy for you!

**NEW USER?** Check out our [Quick Start](#quick-start) guide or see what [Features](#features) our application has!

**NEED HELP?** Take a look at the [Commands](#commands) section!

**ALREADY A PRO?** Jump ahead to the [Command Summary](#command-summary) to get an overview of all the commands!

![duck](images/address_book_32.png)

<div style="page-break-after: always;"></div>

<!-- * Table of Contents -->

<h1 style="font-size: 30px; color: #e46c0a;">Table of Contents</h1>  

--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-success" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span> <span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span> 
<span class="badge rounded-pill bg-danger" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span> <span class="badge rounded-pill bg-danger" style="font-size: 14px; vertical-align: middle;">Advanced</span>


Navigate the User Guide by clicking on the headings below.

  <ul style="font-size: 18px; color: #4F4F4F; font-weight: bold;">  
      <li><a href="{{ baseUrl }}/UserGuide.html#getting-started" style="color:black">Getting Started <span class="badge rounded-pill bg-success" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span></a></li>
      <ul style="font-size: 16px; font-weight: bold;" style="color:black">  
          <li><a href="{{ baseUrl }}/UserGuide.html#quick-start" style="color:#4F4F4F">Quick Start</a></li> 
          <li><a href="{{ baseUrl }}/UserGuide.html#navigating-this-user-guide" style="color:#4F4F4F">Navigating This User Guide</a></li> 
          <li><a href="{{ baseUrl }}/UserGuide.html#features" style="color:#4F4F4F">Features</a></li> 
      </ul>  
      <li><a href="{{ baseUrl }}/UserGuide.html#commands" style="color:black">Commands <span class="badge rounded-pill bg-success" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span></a></li>
      <ul style="font-size: 16px; font-weight: bold;">  
          <li><a href="{{ baseUrl }}/UserGuide.html#general-commands" style="color:#4F4F4F">General Commands</a></li>  
          <li><a href="{{ baseUrl }}/UserGuide.html#contacts-management" style="color:#4F4F4F">Contacts Management</a></li>  
          <li><a href="{{ baseUrl }}/UserGuide.html#finance-management" style="color:#4F4F4F">Finance Management</a></li>  
          <li><a href="{{ baseUrl }}/UserGuide.html#events-management" style="color:#4F4F4F">Events Management </a></li>
      </ul>  
      <li><a href="{{ baseUrl }}/UserGuide.html#data-storage" style="color:black">Data Storage</a></li>  
      <ul style="font-size: 16px; font-weight: bold;">  
          <li><a href="{{ baseUrl }}/UserGuide.html#saving-the-data" style="color:#4F4F4F">Saving the Data <span class="badge rounded-pill bg-success" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span></a></li>  
          <li><a href="{{ baseUrl }}/UserGuide.html#editing-the-data-file" style="color:#4F4F4F">Editing the Data File <span class="badge rounded-pill bg-danger" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span></a></li> 
          <li><a href="{{ baseUrl }}/UserGuide.html#configuration-files" style="color:#4F4F4F">Configuration Files <span class="badge rounded-pill bg-danger" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span></a></li>
      </ul>  
      <li><a href="{{ baseUrl }}/UserGuide.html#accepted-date-time-formats" style="color:black">Accepted Date-time Formats <span class="badge rounded-pill bg-success" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span><span class="badge rounded-pill bg-danger" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span></a></li>  
      <li><a href="{{ baseUrl }}/UserGuide.html#command-summary" style="color:black">Command Summary <span class="badge rounded-pill bg-danger" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span></a></li>  
      <ul style="font-size: 16px; font-weight: bold;">  
          <li><a href="{{ baseUrl }}/UserGuide.html#general" style="color:#4F4F4F">General</a></li>  
          <li><a href="{{ baseUrl }}/UserGuide.html#contacts-tab" style="color:#4F4F4F">Contacts Tab</a></li>  
          <li><a href="{{ baseUrl }}/UserGuide.html#finance-tab" style="color:#4F4F4F">Finance Tab</a></li>  
          <li><a href="{{ baseUrl }}/UserGuide.html#events-tab" style="color:#4F4F4F">Events Tab</a></li>  
      </ul>  
      <li><a href="{{ baseUrl }}/UserGuide.html#faq" style="color:black">FAQ</a></li>  
  </ul>

<div style="page-break-after: always;"></div>

### Quick Start
--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

1. Ensure you have Java `11` or above installed on your computer. Not sure how to do that? Check out the instructions [here](https://www.java.com/en/download/help/version_manual.html).

2. Download the latest `FreelanceBuddy.jar` from our [releases page](https://github.com/AY2324S1-CS2103T-W09-2/tp/releases/).

3. Copy the file to the folder you want to use as the _home folder_ for your app. This is where all the saved and configuration data will be stored!

4. On a command terminal, `cd` into the _home folder_ you chose earlier, and enter the following command to run the application:

   `java -jar FreelanceBuddy.jar`


The FreelanceBuddy GUI should appear in a few seconds, as shown below.

> The app comes with some sample data when you first run it!

![Ui](images/Ui.png)

5. Upon successful launch, you should see 3 **tabs**:
    * <span style="color:#a30039">**Contacts**<span> (This tab is opened by default)
    * <span style="color:#02bd5c">**Finance**<span>
    * <span style="color:#7725fa">**Events**<span>

   To find out what each tab does, check out our [Features](#features) section!

6. At the top, there is a **command box** with the text "_Enter command here..._". This is where you type your commands. After typing each command, press Enter to execute it.

7. For certain commands, there may be a message indicating the success or failure of that command displayed in the **console**, located right under the command box.

<div style="page-break-after: always;"></div>

Now that you've got FreelanceBuddy set up, here are some **example commands** to get you started!

1. `add n/John Doe p/98765432 e/johnd@example.com` : Adds a contact named `John Doe` to the contact list with phone number `98765432` and email `johnd@example.com`.

2. `delete 3` : Deletes the 3rd contact shown in the contact list.

3. `filter-n Alex` : Filters all the contacts named `Alex`. You should see only the contacts that have `Alex` in their name.

4. `list` : Lists all the contacts in the contact list.

5. `tab finance` : Switches the displayed tab to the Finance tab.

6. `add-e d/Chatbot a/200` : Adds a `200` dollar expense with the description `Chatbot`.

7. `list expense` : Lists only expenses in the finance list. One of them should be the expense you just added!

8. `exit` : Exits the app.

For more commands such as edit and filter commands, as well as detailed instructions on how to use each of them, check out the [Commands](#commands) section below!

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

### Navigating This User Guide
--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

The FreelanceBuddy User Guide is built to be user-friendly for all levels of users!

#### Conventions Used

<span class="badge rounded-pill bg-success" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span> <span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>
: Sections for beginners or new users.

<span class="badge rounded-pill bg-danger" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span> <span class="badge rounded-pill bg-danger" style="font-size: 14px; vertical-align: middle;">Advanced</span>
: Sections for advanced or experienced users.

#### Quick Navigation in one click

##### <span style="color:#f79400">Mini Table of Contents</span>
We have included a mini table of contents to help you navigate each section quickly. An example is shown below:

![miniToc](images/miniToc.png =450x)

You can click on the command or the brief description to quickly jump to that sub-section.

##### <span style="color:#f79400">Mini Hyper Links</span>
Each sub-section includes a "Back to ..." link for you to jump back up to the table of contents / major sections where you can continue exploring from there. For example:

[↑ Back to Table of Contents](#table-of-contents) 

[Back to Navigating This User Guide](#navigating-this-user-guide)

##### <span style="color:#f79400">Orange Arrow</span>

![up arrow](images/up.jpg =20x) &nbsp; Navigate to the top by clicking on the orange arrow at the bottom right of the page.

#### Boxes

<box type = "tip" seamless>

This means these are some things that you should take note of for each command.
</box>

<box type = "warning" seamless> 

This means that you should follow to avoid common errors that you might face.
</box>

#### Result

The "Result:" in this guide shows what should appear in the result box for each command.

Example: `list` in <span style="color:#7725fa">Events Tab</span>

![result example](images/resultExample.png)

> Result: Listed all upcoming events


[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

### Features
--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

FreelanceBuddy is made up of **three main systems**. It has:
- A <span style="color:#a30039"> **contact** </span> management system
- A <span style="color:#02bd5c">**finance**</span> tracker
- An <span style="color:#7725fa">**event**</span> scheduling system for events, tasks and meetings.

The following sections describe the data stored in FreelanceBuddy.

<h4 style="color:#a30034">Contact Management System</h4>


-> ![contacts icon](images/icons/contacts.webp =30x) <-

-> _A <span style="color:#a30039">contact</span> in FreelanceBuddy represents a **client, or a representative of a company** </br> that is using your services._ <-

Each <span style="color:#a30039">contact</span> contains the following information:

|  Type of information  | Description                                            |     Required?      |
|:---------------------:|--------------------------------------------------------|:------------------:|
|       **Name**        | The name of the client.                                | :white_check_mark: |
|   **Phone Number**    | The client's phone number.                             | :white_check_mark: |
|       **Email**       | The client's email.                                    | :white_check_mark: |
|      **Address**      | The client's address.                                  |        :x:         |
|      **Company**      | The company that the client belongs to, or represents. |        :x:         |
|   **Telegram Name**   | The client's Telegram username.                        |        :x:         |

You can check out commands related to <span style="color:#a30039">Contacts</span> [here](#contacts-management). A summary of <span style="color:#a30039">Contacts Tab</span> commands can also be found [here](#contacts-tab).

<div style="page-break-after: always;"></div>

<h4 style="color:#02bd5c">Finance Tracker</h4>

A finance entry in FreelanceBuddy could be either a #g#**Commission**## or an #r#**Expense**##. These are from the perspective of your personal finances.


-> ![commission icon](images/icons/commission.webp =35x) <-

_-> A #g#**Commission**## represents a **payment made by a client to you** <-_


-> ![expense icon](images/icons/expenses.webp =35x) <-
_-> An #r#**Expense**##  represents some **cost incurred on either personal spending or on your projects** <-_

For instance, if you received <span style="color:green">+ 200</span> from a client for making a chatbot, that's a #g#**commission**##.

If you spent <span style="color:red">- 80</span> on a Photoshop subscription for your client's project, that's an #r#**expense**##.

Both **commissions** and **expenses** are considered finance entries so they are on the same list, but you can filter them using commands such as `list commission` or `list expense`!

Each finance entry contains the following information:

| Type of information | Description                                                                                                                                                                                                                                                                                                 | Required for Commission? | Required for Expense? |
|:-------------------:|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------:|:---------------------:|
|   **Description**   | A description of the finance entry.                                                                                                                                                                                                                                                                         |    :white_check_mark:    |  :white_check_mark:   |
|   **Client Name**   | The client associated with the finance entry, if any.<br>**Required for #g#commissions##** only, as every #g#commission## must come from some client!<br>**Client must exist in your contact list at the time of creation!**<br>This is not checked after creation, so make sure your contacts are correct! |    :white_check_mark:    |          :x:          |
|     **Amount**      | Amount of money associated with the entry.                                                                                                                                                                                                                                                                  |    :white_check_mark:    |  :white_check_mark:   |
|    **Time Due**     | The time by which the finance entry should be settled. By default, this is the creation time.                                                                                                                                                                                                               |           :x:            |          :x:          |

You can check out commands related to <span style="color:#02bd5c">Finance</span> [here](#finance-management). A summary of <span style="color:#02bd5c">Finance Tab</span> commands can also be found [here](#finance-tab).

<div style="page-break-after: always;"></div>

<h4 style="color:#7725fa">Event Scheduling System</h4>

-> ![events icon](images/icons/events.webp =35x) <-

_-> Keep track of your daily schedule by creating <span style="color:#7725fa">events</span> in FreelanceBuddy! <-_

Be it your **personal task**, or **appointments** that are **related to clients**, you can input them into FreelanceBuddy and manage them seamlessly!

| Type of information | Description                                      |     Required?      |
|:-------------------:|--------------------------------------------------|:------------------:|
|      **Name**       | The name of the event.                           | :white_check_mark: |
|   **Start Time**    | The start time of the event                      | :white_check_mark: |
|    **End Time**     | The end time of the event                        | :white_check_mark: |
|     **Clients**     | The clients' tagged to this particular event.    |        :x:         |
|    **Location**     | The location that the event is taking place at   |        :x:         |
|   **Description**   | Additional remarks that are related to the event |        :x:         |

You can check out commands related to <span style="color:#7725fa">Events</span> [here](#events-management). A summary of <span style="color:#7725fa">Events Tab</span> commands can also be found [here](#events-tab).

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

## Commands
--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

<box type="info" seamless>

**Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g `n/NAME [t/TELEGRAM_NAME]` can be used as `n/John Doe t/@johnnyd` or as `n/John Doe`.

* Items with `…`​ after them can be used any number of times.<br>
  e.g. `[c/CLIENT]…​` can be used as `c/Alex Yeoh`, `c/Alex Yeoh c/Bernice Yu` or omitted entirely.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `exit` and `clear`) will be ignored.<br>
  e.g. if the input is `help 123`, it will be interpreted as `help`.

* Note that those with the same command may mean different things in different tabs. <br>
  e.g. [`filter-c`](#finding-contact-by-company-contacts-tab-filter-c) in Contacts filters by company name, while [`filter-c`](#filtering-events-by-clients-events-tab-filter-c) in Events tab filters by client's name

* Be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.

</box>

<div style="page-break-after: always;"></div>

### General Commands

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

This is a mini table of contents for general commands to help you navigate this section quickly.

*Click on the commands or description to jump to the desired section!*

|                Command                 | Brief Description                                                                      |
|:--------------------------------------:|----------------------------------------------------------------------------------------|
|      [`help`](#viewing-help-help)      | [<p style="color:black">Opens help window with link to User Guide</p>](#viewing-help-help) |
|      [`tab`](#switching-tabs-tab)      | [<p style="color:black">Navigate between tabs</p>](#switching-tabs-tab)                    |
|  [`exit`](#exiting-the-program-exit)   | [<p style="color:black">Exits the program</p>](#exiting-the-program-exit)                  |
| [`clear`](#clearing-all-entries-clear) | [<p style="color:black">Clears all entries</p>](#clearing-all-entries-clear)           |

[↑ Back to Table of Contents](#table-of-contents)

#### Viewing help → `help`

Shows a link to this help page. Each tab will show the link specifically for the tab itself,
and pressing F1 will show the link to this general User Guide as shown below.

![dashboard help message](images/helpMessage.png)

Format: `help`

[Back to General Commands](#general-commands)

<div style="page-break-after: always;"></div>

#### Switching tabs → `tab`

Switch views to the specific tab.

Format: `tab TAB_NAME`

> **RESULT:** Tab will be switched to `TAB_NAME` on GUI

Acceptable values for `TAB_NAME`:

* `contacts`

* `events`

* `finance`

| #g#Positive Examples## | #r#Negative Examples## | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                              |
|:----------------------:|:----------------------:|------------------------------------------------------------------------------------------------------------------------|
|     `tab contacts`     |     `tab contact`      | <span style ='color: darkred; text-decoration: underline;'>Invalid Parameter</span><br/> Wrong spelling for "contacts" |
|      `tab events`      |         `tab`          | <span style ='color: darkred; text-decoration: underline;'>Missing Parameter(s)</span><br/> Missing `TAB_NAME`         |

[Back to General Commands](#general-commands)

#### Exiting the program → `exit`

Exits the program.

Format: `exit`

[Back to General Commands](#general-commands)

#### Clearing all entries : `clear`

Clears all entries from the Tab you are on.

Format: `clear`

> **RESULT:** Address/Finance/Events book has been cleared!

<box type="warning" seamless>
    This is a <b>destructive</b> command that <b>deletes all your data</b>!
</box>

[Back to General Commands](#general-commands)

<div style="page-break-after: always;"></div>

<h3 style="color:#a30039"> Contacts Management</h3>

--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

To view the <span style="color:#a30039">Contacts tab</span>, either click on the “Contacts” button, or use the command `tab contacts` to switch tabs.

Note that the terms "contact" and "client" are used interchangeably (both means the same thing).

This is a mini table of contents for general commands to help you navigate this section quickly.

*Click on the commands or description to jump to the desired section!*

|                              Command                               | Brief Description                                                                                                   |
|:------------------------------------------------------------------:|---------------------------------------------------------------------------------------------------------------------|
|         [`list`](#listing-all-contacts-contacts-tab-list)          | [<p style="color:black">View all contacts</p>](#listing-all-contacts-contacts-tab-list)                             |
|            [`add`](#adding-a-contact-contacts-tab-add)             | [<p style="color:black">Add a new contact</p>](#adding-a-contact-contacts-tab-add)                                  |
|           [`edit`](#editing-a-contact-contacts-tab-edit)           | [<p style="color:black">Edit an existing contact</p>](#editing-a-contact-contacts-tab-edit)                         |
|     [`delete`](#deleting-a-contact-entry-contacts-tab-delete)      | [<p style="color:black">Delete an existing contact</p>](#deleting-a-contact-entry-contacts-tab-delete) 	 |
|  [`filter-n`](#filtering-contacts-by-name-contacts-tab-filter-n)   | [<p style="color:black">Filter contacts by name</p>](#filtering-contacts-by-name-contacts-tab-filter-n)             |
| [`filter-c`](#filtering-contacts-by-company-contacts-tab-filter-c) | [<p style="color:black">Filter contacts by company</p>](#filtering-contacts-by-company-contacts-tab-filter-c)       |

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

#### <span style="color:#a30039"> Listing all Contacts: Contacts Tab →</span> `list`

Shows a list of all <span style="color:#a30039">contacts</span>.

Format: `list`

> **RESULT:** Listed all contacts

[Back to Contacts Management](#contacts-management)

#### <span style="color:#a30039">Adding a Contact: Contacts Tab → </span> `add`

Adds a new <span style="color:#a30039">contact</span>.

Format: `add n/NAME p/PHONE_NUMBER e/EMAIL [a/ADDRESS] [c/COMPANY] [t/TELEGRAM_NAME]`

> **RESULT:**
> New contact added:`NAME`;`PHONE`;`EMAIL`;`ADDRESS`;`COMPANY`;`TELEGRAM_NAME`

<box type="tip" seamless>

* <code>[a/ADDRESS]</code> should preferably be the company’s address
* There cannot be duplicate <span style="color:#a30039">contact</span> `NAME`!
    * For example: `John Doe` and `john Doe` is ok but another `John Doe` is strictly not allowed
      </box>

<box type="warning" seamless>

If a client is updated or deleted after it is used to create a <span style="color:#02bd5c">Finance</span> or <span style="color:#7725fa">Event</span> entry, changes will be reflected in the <span style="color:#a30039">Contacts</span> tab, _but not in the <span style="color:#02bd5c">Finance</span> or <span style="color:#7725fa">Events</span> tab_
* See reasoning [here](#faq)
  </box>

|     Parameter     | Format                                                                                                         | Examples (#g#Valid##/#r#Invalid##)                                                                    |
|:-----------------:|----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
|      `NAME`       | Text up to 256 characters<br>Must be unique                                                                    | #g#Annie Dunkins##<br>#g#'Chewbaca' The 1st##                                                         |
|  `PHONE_NUMBER`   | Valid international phone number with an optional country code                                                 | #g#81234567##<br>#g#+65 81234567##<br>#r#A0u38niufd##<br>#r#(phone number cannot contain alphabets)## |
|      `EMAIL`      | %%\[emailID]@[domainName\]%%<br>[Check email format here](https://www.site24x7.com/tools/email-validator.html) | #g#anniedun.kins[]()@gmail.com##<br>#r#@gmail.com (no email ID)##                                     |
|    `[ADDRESS]`    | Text up to 256 characters                                                                                      | #g#5 Science Park Dr, Singapore 118265##                                                              |
|    `[COMPANY]`    | Text up to 256 characters                                                                                      | #g#Shopee##<br>#g#Sh0p33##                                                                            |
| `[TELEGRAM_NAME]` | Start with `@`, directly followed by only `A-Z`, `a-z`, `0-9`, and/or underscores                              | #g#@destiny_30##<br>#r#@destiny.30##<br>#r#(Telegram doesn't accept '.' in their username format)##   |

|                                  #g#Positive Examples##                                   |                                        #r#Negative Examples##                                         | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                      |
|:-----------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------------------------------------------------|
|                `add n/‘Chewbaca’ The 1st p/+659123139 e/chewie@gmail.com`                 |                                `add   p/+659832139 e/chewie@gmail.com`                                | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `n/NAME` is missing                                  |
|                 `add n/John Doe p/+6234-34344 e/mysteriousdeer@gmail.com`                 |                                                 `add`                                                 | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `n/NAME`, `p/PHONE_NUMBER`, and `e/EMAIL` is missing |
| `add n/Annie Dunkins p/+610489630614 e/ann1e@gmail.com a/Opera house c/NAB t/@anniebirds` | `add n/Annie Dunkins p/+610489630614 e/ann1e@gmail.com a/Opera house c/NAB c/Atlassian t/@anniebirds` | <span style ='color: darkred; text-decoration: underline'>Excessive Parameter(s)</span><br> At most one `[c/COMPANY]` name is allowed          |

[Back to Contacts Management](#contacts-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#a30039">Editing a Contact : Contacts Tab → </span> `edit`

Edits an existing <span style="color:#a30039">contact</span> using `INDEX`.

Format: `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [c/COMPANY] [t/TELEGRAM_NAME]`

> **RESULT:** Edited contact to:`NAME`;`PHONE`;`EMAIL`;`ADDRESS`;`COMPANY`;`TELEGRAM_NAME`

<box type="tip" seamless>

* The `INDEX` refers to the index number shown in the displayed <span style="color:#a30039">contact</span> list
* At least one of the [optional] fields must be provided
* You can remove [optional] fields by typing `PREFIX/` without specifying anything after. e.g., `t/`
    * Refer to [the add command](#adding-a-contact-contacts-tab-add) to check which parameters are optional fields

</box>


<box type="warning" seamless>

If a client is updated or deleted after it is used to create a <span style="color:#02bd5c">Finance</span> or <span style="color:#7725fa">Event</span> entry, changes will be reflected in the <span style="color:#a30039">Contacts</span> tab, _but not in the <span style="color:#02bd5c">Finance</span> or <span style="color:#7725fa">Events</span> tab_
* See reasoning [here](#faq)
  </box>

<div style="page-break-after: always;"></div>

|     Parameter     | Format                                                                                                         | Examples (#g#Valid##/#r#Invalid##)                                                                                             |
|:-----------------:|----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
|      `INDEX`      | Positive integers                                                                                              | (Assuming that there are 10 entries)<br>#g#1##<br>#r#123 (not within range of indices) ##<br>#r#-1 (must be positive number)## |
|     `[NAME]`      | Text up to 256 characters<br>Must be unique                                                                    | #g#Annie Dunkins##<br>#g#'Chewbaca' The 1st##                                                                                  |
| `[PHONE_NUMBER]`  | Valid international phone number with an optional country code                                                 | #g#81234567##<br>#g#+6581234567##<br>#r#A0u38niufd##<br>#r#(phone number cannot contain alphabets)##                           |
|     `[EMAIL]`     | %%\[emailID]@[domainName\]%%<br>[Check email format here](https://www.site24x7.com/tools/email-validator.html) | #g#anniedun.kins[]()@gmail.com##<br>#r#@gmail.com (no email ID)##                                                              |
|    `[ADDRESS]`    | Text up to 256 characters                                                                                      | #g#5 Science Park Dr, Singapore 118265##                                                                                       |
|    `[COMPANY]`    | Text up to 256 characters                                                                                      | #g#Shopee##<br>#g#Sh0p33##                                                                                                     |
| `[TELEGRAM_NAME]` | Start with `@`, directly followed by only `A-Z`, `a-z`, `0-9`, and/or underscores                              | #g#@destiny_30##<br>#r#@destiny.30##<br>#r#(Telegram doesn't accept '.' in their username format)##                            |

|    #g#Positive Examples##     |               #r#Negative Examples##               | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                     |
|:-----------------------------:|:--------------------------------------------------:|-------------------------------------------------------------------------------------------------------------------------------|
| `edit 1 n/‘Chewbaca’ The 1st` |            `edit  n/‘Chewbaca’ The 1st`            | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `INDEX` is missing                  |
|  `edit 2 n/Betsy Crower t/`   | `edit 1 n/‘Chewbaca’ The 1st n/‘Chewbaca’ The 1st` | <span style ='color: darkred; text-decoration: underline'>Excessive Parameter(s)</span><br> At most one `[n/NAME]` is allowed |

[Back to Contacts Management](#contacts-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#a30039">Deleting a Contact entry: Contacts Tab →</span> `delete`

Deletes an existing <span style="color:#a30039">contact</span> using `INDEX`.

Format: `delete INDEX`

> **RESULT:** Deleted contact:`NAME`;`PHONE`;`EMAIL`;`ADDRESS`;`COMPANY`;`TELEGRAM_NAME`

<box type="tip" seamless>

* The `INDEX` refers to the index number shown in the displayed <span style="color:#a30039">contact</span> list
* If you deleted <span style="color:#a30039">contact</span> by accident, you can refer to the result box to see the details of the deleted <span style="color:#a30039">contact</span> and add them again
  </box>

<box type="warning" seamless>

If a client is updated or deleted after it is used to create a <span style="color:#02bd5c">Finance</span> or <span style="color:#7725fa">Event</span> entry, changes will be reflected in the <span style="color:#a30039">Contacts</span> tab, _but not in the <span style="color:#02bd5c">Finance</span> or <span style="color:#7725fa">Events</span> tab_
* See reasoning [here](#faq)
  </box>

| Parameter | Format            | Examples (#g#Valid##/#r#Invalid##)                                                                                             |
|:---------:|-------------------|--------------------------------------------------------------------------------------------------------------------------------|
|  `INDEX`  | Positive integers | (Assuming that there are 10 entries)<br>#g#1##<br>#r#123 (not within range of indices) ##<br>#r#-1 (must be positive number)## |

| #g#Positive Examples## |  #r#Negative Examples##   | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                                     |
|:----------------------:|:-------------------------:|---------------------------------------------------------------------------------------------------------------------------------------------------------------|
|       `delete 1`       |         `delete`          | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `INDEX` is missing                                                  |
|       `delete 2`       |       `delete 2000`       | <span style ='color: darkred; text-decoration: underline'>Invalid Index</span><br> `INDEX` is out of range, choose an `INDEX` that is within the contact list |
|       `delete 3`       | `delete -3`<br>`delete 0` | <span style ='color: darkred; text-decoration: underline'>Index Not Positive</span><br> Choose a positive `INDEX` that is within contact list                 |

[Back to Contacts Management](#contacts-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#a30039">Filtering Contacts by `NAME`: Contacts Tab →</span> `filter-n` 

Shows a list of <span style="color:#a30039">contacts</span> whose `NAME` contains specified string.

Format: `filter-n KEYWORD [MORE_KEYWORDS]...`

> **RESULT:** Listed contacts with names containing `KEYWORD [MORE_KEYWORDS]` (found: _number of matched contacts_)

<box type="tip" seamless>

* The search is **case-insensitive**
* The search is by the <code>NAME</code> of <span style="color:#a30039">contact</span>
* Only full keywords will be matched. e.g. <code>Al</code> will not match with <code>Alex</code>
> `aLeX` → 1. Alex Yeoh
* <span style="color:#a30039">Contacts</span> with `NAME` matching at least one keyword will be returned (i.e. OR search)
> `Alex Roy` → 1. Alex Yeoh
>             2. Roy Balakrishnan
* The order of the keywords does not matter
> `Roy Alex` → 1. Alex Yeoh
>             2. Roy Balakrishnan

</box>

**Example:**
![contacts filter-n demo](images/contacts_filter-n.png)

<div style="page-break-after: always;"></div>

| Parameter | Format                    | Examples (#g#Valid##/#r#Invalid##) |
|:---------:|---------------------------|------------------------------------|
| `KEYWORD` | Text up to 256 characters | #g#Hans##<br>#g#3##                |

| #g#Positive Examples## | #r#Negative Examples## | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                 |
|:----------------------:|:----------------------:|---------------------------------------------------------------------------------------------------------------------------|
|    `filter-n Alex`     |       `filter-n`       | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> <code>KEYWORD</code> is missing |
|  `filter-n aLEx rOy`   |                        |                                                                                                                           |

[Back to Contacts Management](#contacts-management)

#### <span style="color:#a30039">Filtering Contacts by <code>COMPANY</code>: Contacts Tab →</span> `filter-c`

Shows a list of <span style="color:#a30039">contacts</span> whose <code>COMPANY</code> contains specified string.

Format: `filter-c KEYWORD [MORE_KEYWORDS]...`

> **RESULT:** Listed contacts with companies containing `KEYWORD [MORE_KEYWORDS]` (found: _number of matched contacts_)

<box type="tip" seamless>

* The search is **case-insensitive**
* The search is by the <code>COMPANY</code> of <span style="color:#a30039">contact</span>
* Only full keywords will be matched. e.g. <code>Goo</code> will not match with <code>Google</code>
* <span style="color:#a30039">Contacts</span> with `COMPANY` matching at least one keyword will be returned (i.e. OR search)
> `FAPro NUS` → 1. Bernice Yu (FAPro)
>             2. Charlotte Oliveiro (NUS)
* The order of the keywords does not matter
> `NUS FAPro` → 1. Bernice Yu (FAPro)
>             2. Charlotte Oliveiro (NUS)

</box>

**Example:**
![contacts filter-c demo](images/contacts_filter-c.png)

| Parameter | Format                    | Examples (#g#Valid##/#r#Invalid##) |
|:---------:|---------------------------|------------------------------------|
| `KEYWORD` | Text up to 256 characters | #g#Google##<br>#g#3##              |

| #g#Positive Examples## | #r#Negative Examples## | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                 |
|:----------------------:|:----------------------:|---------------------------------------------------------------------------------------------------------------------------|
|   `filter-c google`    |       `filter-c`       | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> <code>KEYWORD</code> is missing |
| `filter-c gOoGle nUs`  |                        |                                                                                                                           |

[Back to Contacts Management](#contacts-management)

<div style="page-break-after: always;"></div>

### <span style="color:#02bd5c">Finance Management</span>
--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

To view the <span style="color:#02bd5c">Finance</span> tab, either click on the “Finance” button, or use the command `tab finance` to switch tabs.

Note that the terms #g#**commission**## and #r#**expense**## will be bolded throughout.

This is a mini table of contents for general commands to help you navigate this section quickly.

*Click on the commands or description to jump to the desired section!*

|                                  Command                                   | Brief Description                                                                                                              |
|:--------------------------------------------------------------------------:|--------------------------------------------------------------------------------------------------------------------------------|
|                [`list`](#listing-finances-finance-tab-list)                | [<p style="color:black">View finance</p>](#listing-finances-finance-tab-list)                                                  |
|             [`add-c`](#adding-a-commission-finance-tab-add-c)              | [<p style="color:black">Add a new commission</p>](#adding-a-commission-finance-tab-add-c)                                          |
|              [`add-e`](#adding-an-expense-finance-tab-add-e)               | [<p style="color:black">Add a new expense</p>](#adding-an-expense-finance-tab-add-e)                                               |
|               [`edit`](#editing-a-finance-finance-tab-edit)                | [<p style="color:black">Edit an existing finance entry</p>](#editing-a-finance-finance-tab-edit)                                   |
|          [`delete`](#deleting-a-finance-entry-finance-tab-delete)          | [<p style="color:black">Delete an existing finance entry</p>](#deleting-a-finance-entry-finance-tab-delete) 	                      |
|      [`filter-c`](#filtering-finances-by-client-finance-tab-filter-c)      | [<p style="color:black">Filter finance by client</p>](#filtering-finances-by-client-finance-tab-filter-c)                          |
|    [`filter-t`](#filtering-finances-by-time-frame-finance-tab-filter-t)    | [<p style="color:black">Filter finance by time frame</p>](#filtering-finances-by-time-frame-finance-tab-filter-t)                  |
| [`summary`](#generating-a-finance-summary-of-a-client-finance-tab-summary) | [<p style="color:black">Summarise finance relating to a client</p>](#generating-a-finance-summary-of-a-client-finance-tab-summary) |

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

#### <span style="color:#02bd5c">Listing finances: Finance Tab → `list`</span>

Shows a list of all <span style="color:#02bd5c">finances</span>/#g#**commissions**##/#r#**expenses**##.

Format: `list [TYPE]`

> **RESULT:** Listed all finances/commissions/expenses


<box type="tip" seamless>

- When <code>commission</code> is given as the <code>TYPE</code>, only #g#**commissions**## are listed
- When <code>expense</code> is given as the <code>TYPE</code>, only #r#**expenses**## are listed
- When <code>TYPE</code> is omitted, all <span style="color:#02bd5c">finances</span> are listed

</box>

| Parameter | Format                                                  | Examples (#g#Valid##/#r#Invalid##)                             |
|:---------:|:--------------------------------------------------------|:---------------------------------------------------------------|
|  `TYPE`   | Either of the following:<br/>`commission`<br/>`expense` | #g#commission##</br>#g#expense##</br>#r#com##<br/>#r#expesne## |

[Back to Finance Management](#finance-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#02bd5c">Adding a Commission: Finance Tab → `add-c`</span>

Adds a new #g#**commission**##. Once added, the `AMOUNT` will be highlighted in #g#**green**## to indicate that
the entry is a commission.

e.g., #g#+ 100##

Format: `add-c d/DESCRIPTION a/AMOUNT c/CLIENT [t/TIME]`

> **RESULT:** New commission added: Amount: `AMOUNT`; Client: `CLIENT`; Description: `DESCRIPTION`; Time: `TIME`

<box type="tip" seamless>

- The <code>DESCRIPTION</code> is used to provide details about the #g#**commission**##
- The default <code>[t/TIME]</code> will be the time at which the command is entered
- Adding multiple of the same exact #g#**commission**## is allowed
  </box>

<box type="warning" seamless>

For `CLIENT`, the name **MUST EXIST** in your <span style="color:#a30039">Contacts</span>. Note that this is **case-sensitive**.

Refer to [the filter-n command](#filtering-contacts-by-name-contacts-tab-filter-n) within the <span style="color:#a30039">Contacts</span> tab to search whether the <span style="color:#a30039">contact</span> exists.

* Note that even though filter-n within the <span style="color:#a30039">Contacts</span> tab is _case-insensitive_, it should make it easier to find the client that you're looking for.
  </box>


|   Parameter   | Format                                                             | Examples (#g#Valid##/#r#Invalid##)                                                                                                                                 |
|:-------------:|:-------------------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `DESCRIPTION` | Text up to 256 characters, cannot be empty                         | #g#This is an example description##</br>                                                                                                                           |
|   `AMOUNT`    | Positive numbers up to two decimal points                          | #g#5.60##</br>#g#56908##</br>#r#$50730 (not a valid number)##</br>#r#-1 or 0 (not a positive number)##</br>#r#556.9834 (too many decimal places)## |
|   `CLIENT`    | Text up to 256 characters                                          | #g#Annie Dun##</br>#g#Samuel Dames##</br>                                                                                                                          |
|   `[TIME]`    | Refer to [accepted Date-time formats](#accepted-date-time-formats) |                                                                                                                                                                    |

|                #g#Positive Examples##                |                                                      #r#Negative Examples##                                                       | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                                          |
|:----------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------:|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add-c c/John Doe a/800 d/Wedding Photoshoot t/tmr`  |                                       `add-c c/John Doe a/$800 d/Wedding Photoshoot t/tmr`                                        | <span style ='color: darkred; text-decoration: underline'>Invalid Parameter</span><br>"$800" is not a valid parameter for `a/AMOUNT` as it does not accept $ signs |
| `add-c c/Steph Evans a/300 d/UI design for NinjaVan` |                                          `add-c c/Steph Evans d/UI design for NinjaVan`                                           | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `a/AMOUNT` is missing                                                    |
|                                                      | `add-c a/100 c/Betsy Crower d/Wedding Photoshoot`<br/> _<span style = 'color:Gray'>(Betsy Crower is not in the contact list)</span>_ | <span style ='color: darkred; text-decoration: underline'>Client Does Not Exist</span><br> `c/CLIENT` 'Betsy Crower' does not exist in your contacts               |


[Back to Finance Management](#finance-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#02bd5c">Adding an Expense: Finance Tab → `add-e`</span>

Adds a new #r#**expense**##. Once added, the `AMOUNT` will be highlighted in #r#**red**## to indicate that
the entry is an expense.

e.g., #r#- 100##

Format: `add-e d/DESCRIPTION a/AMOUNT [c/CLIENT] [t/TIME]`

> **RESULT:** New expense added: Amount: `AMOUNT`; Client: `CLIENT`; Description: `DESCRIPTION`; Time: `TIME`

<box type="tip" seamless>

- The <code>DESCRIPTION</code> is used to provide details about the #r#**expense**##
- The default <code>[t/TIME]</code> will be the time at which the command is entered
- Adding multiple of the same exact #r#**expense**## is allowed

</box>

<box type="warning" seamless>

For `CLIENT`, the name **MUST EXIST** in your <span style="color:#a30039">Contacts</span>. Note that this is **case-sensitive**.

Refer to [the filter-n command](#filtering-contacts-by-name-contacts-tab-filter-n) within the <span style="color:#a30039">Contacts</span> tab to search whether the <span style="color:#a30039">contact</span> exists.

* Note that even though filter-n within the <span style="color:#a30039">Contacts</span> tab is _case-insensitive_, it should make it easier to find the client that you're looking for.
  </box>


|   Parameter   | Format                                                             | Examples (#g#Valid##/#r#Invalid##)                                                                                                                                 |
|:-------------:|:-------------------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `DESCRIPTION` | Text up to 256 characters, cannot be empty                         | #g#This is an example description##</br>                                                                                                                           |
|   `AMOUNT`    | Positive numbers up to two decimal points                          | #g#5.60##</br>#g#1902.1##</br>#g#56908##</br>#r#$50730 (not a valid number)##</br>#r#-1 or 0 (not a positive number)##</br>#r#556.9834 (too many decimal places)## |
|  `[CLIENT]`   | Text up to 256 characters                                          | #g#Annie Dun##</br>#g#Samuel Dames##</br>                                                                                                                          |
|   `[TIME]`    | Refer to [accepted Date-time formats](#accepted-date-time-formats) |                                                                                                                                                                    |

|         #g#Positive Examples##          |                                     #r#Negative Examples##                                     | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                                          |
|:---------------------------------------:|:----------------------------------------------------------------------------------------------:|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add-e c/John Doe a/200 d/Dinner t/tmr` |                            `add-e c/John Doe a/$200 d/Dinner t/tmr`                            | <span style ='color: darkred; text-decoration: underline'>Invalid Parameter</span><br>$200 is not a valid parameter for `a/AMOUNT` as it does not accept $ signs   |
|     `add-e a/100 d/Adobe Photoshop`     |                                   `add-e d/Adobe Photoshop`                                    | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `a/AMOUNT` is missing                                                    |
|                                         | `add-e a/100 e/Betsy Crower d/Adobe Photoshop`<br/> _<span style = 'color:Gray'>(Betsy Crower is not in the contact list)</span>_  | <span style ='color: darkred; text-decoration: underline'>Client Does Not Exist</span><br> `[c/CLIENT]` 'Betsy Crower' does not exist in your contacts             |


[Back to Finance Management](#finance-management)

#### <span style="color:#02bd5c">Editing a finance : Finance Tab → `edit`</span>

Edits an existing <span style="color:#02bd5c">finance</span> entry using `INDEX`.

Format: `edit INDEX [d/DESCRIPTION] [a/AMOUNT] [c/CLIENT] [t/TIME]`

> **RESULT:** Edited expense/commission to: Amount: `AMOUNT`; Client: `CLIENT`; Description: `DESCRIPTION`; Time: `TIME`

<box type="tip" seamless>

* The `INDEX` refers to the index number shown in the displayed <span style="color:#02bd5c">finance</span> list.
* At least one of the [optional] fields must be provided.
* You can remove [optional] fields by typing `PREFIX/` without specifying anything after. e.g., `d/`
    * Refer to the add command for [expense](#adding-an-expense-finance-tab-add-e) and [commission](#adding-a-commission-finance-tab-add-c) to check which parameters are optional fields
    * Note that you can remove `CLIENT` from #r#**expense**##, **but not from** #g#**commissions**##
* By design, it is not possible to edit the type of finance (i.e., convert #r#**expense**## to #g#**commission**## and vice versa) <br> <span style="color:#a6a6a6">(unless you [<span style="color:#a6a6a6">edit the data file</span>](#editing-the-data-file))</span>
      </box>

<box type="warning" seamless>

For `CLIENT`, the name **MUST EXIST** in your <span style="color:#a30039">Contacts</span>. Note that this is **case-sensitive**.

Refer to [the filter-n command](#filtering-contacts-by-name-contacts-tab-filter-n) within the <span style="color:#a30039">Contacts</span> tab to search whether the <span style="color:#a30039">contact</span> exists.

* Note that even though filter-n within the <span style="color:#a30039">Contacts</span> tab is _case-insensitive_, it should make it easier to find the client that you're looking for.
  </box>


|    Parameter    | Format                                                             | Examples (#g#Valid##/#r#Invalid##)                                                                                                                                               |
|:---------------:|:-------------------------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|     `INDEX`     | Positive integer within range of indices in finance list	          | (Assuming that there are 10 entries)</br>#g#2##</br>#g#10##</br>#r#13 (not within range of indices)##</br>#r#-1 or 0 (not a positive number)##</br>#r#56.9834 (not an integer)## |
| `[DESCRIPTION]` | Text up to 256 characters, cannot be empty                         | #g#This is an example description##</br>                                                                                                                                         |
|   `[AMOUNT]`    | Positive numbers up to two decimal points                          | #g#5.60##</br>#g#1902.1##</br>#g#56908##</br>#r#$50730 (not a valid number)##</br>#r#-1 or 0 (not a positive number)##</br>#r#556.9834 (too many decimal places)##               |
|   `[CLIENT]`    | Text up to 256 characters                                          | #g#Annie Dun##</br>#g#Samuel Dames##</br>                                                                                                                                        |
|    `[TIME]`     | Refer to [accepted Date-time formats](#accepted-date-time-formats) |                                                                                                                                                                                  |

|                                  #g#Positive Examples##                                   |                                                   #r#Negative Examples##                                                    | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                              |
|:-----------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------:|--------------------------------------------------------------------------------------------------------------------------------------------------------|
| `edit 1 c/ a/20 d/Lunch t/tmr` <br/> _<span style="color:gray">(editing an expense)</span>_ |              `edit 1 c/ a/50 d/Painting t/tmr` <br/> _<span style="color:gray">(editing a commission)</span>_               | <span style ='color: darkred; text-decoration: underline'>Unable to Remove Client</span><br>You can't remove `[c/CLIENT]` from commissions             |
|  `edit 1 d/Adobe Photoshop` <br/> _<span style="color:gray">(editing a commission)</span>_  |         `edit 1 c/Betsy Crower`<br/> _<span style = 'color:Gray'>(Betsy Crower is not in the contact list)</span>_          | <span style ='color: darkred; text-decoration: underline'>Client Does Not Exist</span><br> `[c/CLIENT]` 'Betsy Crower' does not exist in your contacts |

[Back to Finance Management](#finance-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#02bd5c">Deleting a Finance entry: Finance Tab → `delete`</span>

Deletes an existing <span style="color:#02bd5c">finance</span> entry using `INDEX`.

Format: `delete INDEX`

> **RESULT:** Deleted expense/commission: Amount: `AMOUNT`; Client: `CLIENT`; Description: `DESCRIPTION`; Time: `TIME`

<box type="tip" seamless>

* The `INDEX` refers to the index number shown in the displayed <span style="color:#02bd5c">finance</span> list
* If you deleted by accident, you can refer to the result box to see the details of the deleted <span style="color:#02bd5c">finance</span> and add it again
  </box>


|    Parameter    | Format                                                          | Examples (#g#Valid##/#r#Invalid##)                                                          |
|:---------------:|-----------------------------------------------------------------|---------------------------------------------------------------------------------------------|
|     `INDEX`     | Positive integer within range of indices in Finance list listed | Assuming there are 10 entries:<br>#g#2##<br>#g#10##<br>#r#14##<br>#r#-1##<br>#r#2.4##       |


| #g#Positive Examples## |                                             #r#Negative Examples##                                             | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                                            |
|:----------------------:|:--------------------------------------------------------------------------------------------------------------:|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|       `delete 2`       |                                                  `delete -1`                                                   | <span style ='color: darkred; text-decoration: underline'>Index Not Positive</span><br> Choose a positive `INDEX` that is within finance list                        |
|       `delete 4`       |                                                  `delete one`                                                  | <span style ='color: darkred; text-decoration: underline'>Invalid Parameter</span><br> "one" is not a valid parameter, as `INDEX` only takes positive numeric values |
|                        | `delete 150` <br>_<span style="color:gray">(while there are less than 150 entries in the finance list)</span>_ | <span style ='color: darkred; text-decoration: underline'>Invalid Index</span><br> `INDEX` is out of range, choose an `INDEX` that is within the finance list        |


[Back to Finance Management](#finance-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#02bd5c">Filtering finances by `CLIENT`: Finance Tab → `filter-c`</span>

Shows a list of <span style="color:#02bd5c">finances</span> whose `CLIENT` name contains specified string.

Format: `filter-c KEYWORD [MORE_KEYWORDS]...`

> **RESULT:** Listed finances with client's name containing `KEYWORD [MORE_KEYWORDS]` (found: _number of matched finances_)

<box type="tip" seamless>

* The search is **case-insensitive**
* The search is by the <code>CLIENT</code> name, see [filter-n in Contacts Tab for more details](https://ay2324s1-cs2103t-w09-2.github.io/tp/UserGuide.html#adding-a-contact-contacts-tab-add)
* Only full keywords will be matched. e.g. <code>Al</code> will not match with <code>Alex</code>
> `aLeX` → 1. Alex Yeoh
* <span style="color:#a30039">Contacts</span> name matching at least one keyword will be returned (i.e. OR search)
> `Alex Roy` → 1. Alex Yeoh
>             2. Roy Balakrishnan
* The order of the keywords does not matter
> `Roy Alex` → 1. Alex Yeoh
>             2. Roy Balakrishnan

</box>

**Example:**
![finance filter-c demo](images/finance_filter-c.png)

<div style="page-break-after: always;"></div>

| Parameter | Format                    | Examples (#g#Valid##/#r#Invalid##) |
|:---------:|:--------------------------|:-----------------------------------|
| `KEYWORD` | Text up to 256 characters | #g#John Doe##</br>#g#3##</br>      |

| #g#Positive Examples## | #r#Negative Examples## | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                             |
|:----------------------:|:----------------------:|-----------------------------------------------------------------------------------------------------------------------|
|  `filter-c John Doe`   |       `filter-c`       | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> <code>KEYWORD</code> is missing |
|    `filter-c JOhN`     |                        |                                                                                                                       |


[Back to Finance Management](#finance-management)

#### <span style="color:#02bd5c">Filtering finances by `TIME FRAME`: Finance Tab → `filter-t`</span>

Shows a list of <span style="color:#02bd5c">finances</span> within the specified `START_TIME` and `END_TIME`.

Format: `filter-t s/START_TIME e/END_TIME` 

> **RESULT:** You have _number of_ commission(s) and _number of_ expense(s) between `START_TIME` and `END_TIME`

**Example:**
![finance filter-t demo](images/finance_filter-t.png)


|           Parameter           | Format                                                                 | Examples (#g#Valid##/#r#Invalid##)  |
|:-----------------------------:|:-----------------------------------------------------------------------|:------------------------------------|
| `s/START_TIME` / `e/END_TIME` | Refer to the [accepted Date-time formats](#accepted-date-time-formats) |                                     |

<div style="page-break-after: always;"></div>

|        #g#Positive Examples##        |    #r#Negative Examples##    | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                                 |
|:------------------------------------:|:----------------------------:|-----------------------------------------------------------------------------------------------------------------------------------------------------------|
|     `filter-t s/tmr e/next week`     | `filter-t s/next week e/tmr` | <span style ='color: darkred; text-decoration: underline'>Invalid Date-Time Duration</span><br> `e/END_TIME` must be chronologically after `s/START_TIME` |
| `filter-t s/2023-10-10 e/2023-10-11` |          `filter-t`          | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `s/START_TIME` and `e/END_TIME` are missing                     |


[Back to Finance Management](#finance-management)

#### <span style="color:#02bd5c">Generating a finance summary of a client: Finance Tab → `summary`</span>

Returns a summary of the <span style="color:#02bd5c">finances</span> for the given `CLIENT`.

Format: `summary CLIENT`

> **RESULT:** You have earned/lost [Total Amount] from/due to `CLIENT`

<box type="tip" seamless>

The summary command provides the following details with regard to a `CLIENT` :
- Total amount earned or lost
- Total number of #g#**commission**## and the amount earned from #g#**commissions**##
- Total number of #r#**expenses**## and the total cost from #r#**expenses**##

</box>

<box type="warning" seamless>

* The `CLIENT` name must match the exact `CLIENT` name (case-sensitive) that is found in the <span style="color:#a30039">Contacts</span> tab. </br>
  This is to prevent any ambiguity in the generated summary.
* Summary only works if the `CLIENT` exists in <span style="color:#a30039">Contacts</span>, so even if you have remaining finance entries linked to a specific `CLIENT`, if you delete the `CLIENT` in the <span style="color:#a30039">Contacts</span>, then the summary command won't work
  </box>

<div style="page-break-after: always;"></div>

**Example:**
![finance summary demo](images/finance_summary.png)

<div style="page-break-after: always;"></div>

| Parameter | Format                    | Examples (#g#Valid##/#r#Invalid##)            |
|:---------:|:--------------------------|:----------------------------------------------|
| `CLIENT`  | Text up to 256 characters | #g#John Doe##</br>#g#'Chewbacca' the 1st##</br> |

| #g#Positive Examples## |                                     #r#Negative Examples##                                     | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                  |
|:----------------------:|:----------------------------------------------------------------------------------------------:|--------------------------------------------------------------------------------------------------------------------------------------------|
|   `summary John Doe`   |                                           `summary`                                            | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `CLIENT` name is missing                               |
|                        | `summary John`<br/><br/> _<span style = 'color:Gray'>(John is not in the contact list)</span>_ | <span style ='color: darkred; text-decoration: underline'>Client Does Not Exist</span><br> `CLIENT` 'John' does not exist in your contacts |


[Back to Finance Management](#finance-management)

<div style="page-break-after: always;"></div>

### <span style="color:#7725fa">Events Management</span>

--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

To view the <span style="color:#7725fa">Events</span> tab, either click on the “Events” button, or use the command `tab events` to switch tabs.

By default, only **upcoming** <span style="color:#7725fa">events</span> will be shown. To view all <span style="color:#7725fa">events</span>, use the `list-all` command.

This is a mini table of contents for general commands to help you navigate this section quickly.

*Click on the commands or description to jump to the desired section!*

|                            Command                             | Brief Description                                                                                     |
|:--------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------|
|     [`list`](#listing-all-upcoming-events-events-tab-list)     | [<p style="color:black">Show all upcoming events](#listing-all-upcoming-events-events-tab-list)       |
|     [`list-all`](#listing-all-events-events-tab-list-all)      | [<p style="color:black">Show all events</p>](#listing-all-events-events-tab-list-all)                 |
|            [`add`](#adding-an-event-events-tab-add)            | [<p style="color:black">Add a new event</p>](#adding-an-event-events-tab-add)                         |
|          [`edit`](#editing-an-event-events-tab-edit)           | [<p style="color:black">Edit an existing event</p>](#editing-an-event-events-tab-edit)                |
|     [`delete`](#deleting-an-event-entry-events-tab-delete)     | [<p style="color:black">Delete an existing event</p>](#deleting-an-event-entry-events-tab-delete) 	   |
| [`filter-c`](#filtering-events-by-client-events-tab-filter-c) | [<p style="color:black">Filter events by client</p>](#filtering-events-by-client-events-tab-filter-c) |
|  [`filter-n`](#filtering-events-by-name-events-tab-filter-n)   | [<p style="color:black">Filter events by name</p>](#filtering-events-by-name-events-tab-filter-n)     |
|  [`filter-t`](#filtering-events-by-time-events-tab-filter-t)   | [<p style="color:black">Filter events by time</p>](#filtering-events-by-time-events-tab-filter-t)     |

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

#### <span style="color:#7725fa">Listing all upcoming events: Events Tab → `list` </span>

Shows a list of all **upcoming** <span style="color:#7725fa">events</span>.

Format: `list`

> **RESULT:** Listed all upcoming events

[Back to Events Management](#events-management)

#### <span style="color:#7725fa">Listing all events: Events Tab → `list-all`</span>

Shows a list of all <span style="color:#7725fa">events</span>, **including past and future**.

Format: `list-all`

> **RESULT:** Listed all events

[Back to Events Management](#events-management)


#### <span style="color:#7725fa">Adding an event: Events Tab → `add`</span>

Adds a new <span style="color:#7725fa">event</span>.

Format: `add n/NAME s/START_TIME e/END_TIME [c/CLIENT]…​ [l/LOCATION] [d/DESCRIPTION]`

> **RESULT:** New event added: `NAME`; Start: `START_TIME`; End: `END_TIME`; Clients: `CLIENTS…​`; Location: `LOCATION`; Description: `DESCRIPTION`

<box type="tip" seamless>

*  The <code>NAME</code> refers to the title of the <span style="color:#7725fa">event</span>
*  The <code>START_TIME</code> and <code>END_TIME</code> refer to starting and ending times of the <span style="color:#7725fa">event</span> respectively
*  Note that each <span style="color:#7725fa">event</span> **can have more than one client**
   (e.g <code>c/David c/Richard c/Anna</code>)
* There cannot be duplicate <span style="color:#7725fa">events</span>!
    * <span style="color:#7725fa">Events</span> will be treated as duplicates if they have the same <code>NAME</code>, <code>START_TIME</code> and <code>END_TIME</code>

</box>

<box type="warning" seamless>

For `CLIENT`, the name **MUST EXIST** in your <span style="color:#a30039">Contacts</span>. Note that this is **case-sensitive**.

Refer to [the filter-n command](#filtering-contacts-by-name-contacts-tab-filter-n) within the <span style="color:#a30039">Contacts</span> tab to search whether the <span style="color:#a30039">contact</span> exists.

* Note that even though filter-n within the <span style="color:#a30039">Contacts</span> tab is _case-insensitive_, it should make it easier to find the client that you're looking for.
  </box>

<div style="page-break-after: always;"></div>

|        Parameter        | Format                                                                 | Examples (#g#Valid##/#r#Invalid##)                                       |
|:-----------------------:|------------------------------------------------------------------------|--------------------------------------------------------------------------|
|         `NAME`          | Text up to 256 characters                                              | #g#Annie Dunkins##<br>#g#'Chewbaca' The 1st##                            |
| `START_TIME` / `END_TIME` | Refer to the [accepted Date-time formats](#accepted-date-time-formats) |                                                                          |
|       `[CLIENT]`        | Text up to 256 characters                                              | #g#John Doe##<br>#g#Ranchoddas Shamaldas Chanchad##                      |
|      `[LOCATION]`       | Text up to 256 characters                                              | #g#50 Cuscaden Rd, #02-01 Hpl House, Singapore 249724##<br>#g#My House## |
|     `[DESCRIPTION]`     | Text up to 256 characters                                              | #g#Bring notes for Davidson##<br>#g#Concerning new commission##          |

|                                 #g#Positive Examples##                                  |                              #r#Negative Examples##                               | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                                          |
|:---------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------:|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `add n/Tennis s/31-09-2023 19:30 e/31-09-2023 21:30 l/20 Lower Kent Ridge Road, 119080` | `add ‎ ‎s/31-09-2023 19:30 e/31-09-2023 21:30 l/20 Lower Kent Ridge Road, 119080` | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `n/NAME` is missing                                                      |
|        `add n/Meetup s/2 hrs from now e/3 hrs from now c/Alex Yeoh c/Bernice Yu`        |    `add n/Meetup s/21022023130pm  e/21-02-2023230pm c/Alex Yeoh c/Bernice Yu`     | <span style ='color: darkred; text-decoration: underline'>Invalid Date-Time Format</span><br> Date-time Format is incorrect for `s/START_TIME` and/or `e/END_TIME` |
|                    `add n/Gym s/21-02-2023 13:30 e/21-02-2023 14:30`                    |                 `add n/Gym s/21-02-2023 13:30 e/21-02-2023 12:30`                 | <span style ='color: darkred; text-decoration: underline'>Invalid Date-Time Duration</span><br> `e/END_TIME` must be chronologically after `s/START_TIME`          |

[Back to Events Management](#events-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#7725fa">Editing an event: Events tab → `edit`

Edits an existing <span style="color:#7725fa">event</span> using `INDEX`.

Format: `edit INDEX [n/NAME] [s/START_TIME] [e/END_TIME] [c/CLIENT]…​ [l/LOCATION] [d/DESCRIPTION]`

> **RESULT:**
>
> Edited Event to: `NAME`; Start: `START_TIME`; End: `END_TIME`; Clients: `CLIENTS…​`; Location: `LOCATION`; Description: `DESCRIPTION`


<box type="tip" seamless>

* The `INDEX` refers to the index number shown in the displayed <span style="color:#7725fa">event</span> list
* At least one of the [optional] fields must be provided
* You can remove [optional] fields by typing `PREFIX/` without specifying anything after. e.g., `d/`
    * Refer to [the add command](#adding-an-event-events-tab-add) to check which parameters are optional fields
* Read [this](#editing-start-time-end-time-in-events) for more information about editing `START_TIME` and `END_TIME`
  </box>

<box type="warning" seamless>

For `CLIENT`, the name **MUST EXIST** in your <span style="color:#a30039">Contacts</span>. Note that this is **case-sensitive**.

Refer to [the filter-n command](#filtering-contacts-by-name-contacts-tab-filter-n) within the <span style="color:#a30039">Contacts</span> tab to search whether the <span style="color:#a30039">contact</span> exists.

* Note that even though filter-n within the <span style="color:#a30039">Contacts</span> tab is _case-insensitive_, it should make it easier to find the client that you're looking for.
  </box>


|          Parameter          | Format                                                                 | Examples (#g#Valid##/#r#Invalid##)                                       |
|:---------------------------:|------------------------------------------------------------------------|--------------------------------------------------------------------------|
|          `[NAME]`           | Text up to 256 characters<br>Must be unique                            | #g#Annie Dunkins##<br>#g#'Chewbaca' The 1st##                            |
| `[START_TIME]` / `[END_TIME]` | Refer to the [accepted Date-time formats](#accepted-date-time-formats) |                                                                          |
|         `[CLIENT]`          | Text up to 256 characters                                              | #g#John Doe##<br>#g#Ranchoddas Shamaldas Chanchad##                      |
|        `[LOCATION]`         | Text up to 256 characters                                              | #g#50 Cuscaden Rd, #02-01 Hpl House, Singapore 249724##<br>#g#My House## |
|       `[DESCRIPTION]`       | Text up to 256 characters                                              | #g#Bring notes for Davidson##<br>#g#Concerning new commission##          |

|                            #g#Positive Examples##                             |                                              #r#Negative Examples##                                               | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                                   |
|:-----------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------:|-------------------------------------------------------------------------------------------------------------------------------------------------------------|
|                               `edit 1 n/Tennis`                               |                                  `edit 1 s/31-09-2023 19:30 e/31-09-2023 16:00`                                   | <span style ='color: darkred; text-decoration: underline'>Invalid Date-Time Duration</span><br> `[e/END_TIME]` must be chronologically after `[s/START_TIME]` |
| `edit 2 n/Meetup s/01-12-2023 2pm e/01-12-2023 3pm c/Alex Yeoh c/Bernice Yu ` | `edit 1 c/Potato Client`<br/>_<span style ='color: gray'>(If "Potato Client" does not exists in Contacts)</span>_ | <span style ='color: darkred; text-decoration: underline'>Client Does Not Exist</span><br> Client 'Potato Client' does not exist in your contacts           |

[Back to Events Management](#events-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#7725fa">Deleting an Event entry: Events Tab → `delete`

Deletes an existing <span style="color:#7725fa">event</span> using `INDEX`.

Format: `delete INDEX`

> **RESULT:** Deleted Event: `NAME`; Start: `START_TIME`; End: `END_TIME`; Clients: `CLIENTS…​`; Location: `LOCATION`; Description: `DESCRIPTION`

<box type="tip" seamless>

- The `INDEX` refers to the index number shown in the displayed <span style="color:#7725fa">event</span> list
- If you deleted the <span style="color:#7725fa">event</span> by accident, you can refer to the result box to see the details of the deleted <span style="color:#7725fa">event</span> and add them again
</box>

|    Parameter    | Format                                                        | Examples (#g#Valid##/#r#Invalid##)                                                          |
|:---------------:|---------------------------------------------------------------|---------------------------------------------------------------------------------------------|
|     `INDEX`     | Positive integer within range of indices in Event list listed | Assuming there are 10 entries:<br>#g#2##<br>#g#10##<br>#r#14##<br>#r#-1##<br>#r#2.4##       |


| #g#Positive Examples## |                                            #r#Negative Examples##                                            | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                                                            |
|:----------------------:|:------------------------------------------------------------------------------------------------------------:|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|       `delete 2`       |                                                 `delete -1`                                                  | <span style ='color: darkred; text-decoration: underline'>Index Not Positive</span><br> Choose a positive `INDEX` that is within event list                          |
|       `delete 4`       |                                                 `delete one`                                                 | <span style ='color: darkred; text-decoration: underline'>Invalid Parameter</span><br> "one" is not a valid parameter, as `INDEX` only takes positive numeric values |
|                        | `delete 150` <br>_<span style="color:gray">(while there are less than 150 entries in the event list)</span>_ | <span style ='color: darkred; text-decoration: underline'>Invalid Index</span><br> `INDEX` is out of range, choose an `INDEX` that is within the event list          |

[Back to Events Management](#events-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#7725fa">Filtering events by `CLIENT`: Events Tab → `filter-c`

Shows a list of <span style="color:#7725fa">events</span> that contains the name of `CLIENT` matching the `KEYWORD`.

Format: `filter-c KEYWORD [MORE_KEYWORDS]...`

> **RESULT:** Listed events for clients name containing `KEYWORD [MORE_KEYWORD]` (found: _number of matched events_)

<box type="tip" seamless>

* The search is **case-insensitive**
* The search is by the name of <code>CLIENT</code>, see [filter-n in Contacts Tab for more details](https://ay2324s1-cs2103t-w09-2.github.io/tp/UserGuide.html#adding-a-contact-contacts-tab-add)
* Only full keywords will be matched. e.g. <code>Al</code> will not match with <code>Alex</code>
> `aLeX` → 1. Alex Yeoh
* <span style="color:#a30039">Contacts</span> name matching at least one keyword will be returned (i.e. OR search)
> `Alex Roy` → 1. Alex Yeoh
>             2. Roy Balakrishnan
* The order of the keywords does not matter
> `Roy Alex` → 1. Alex Yeoh
>             2. Roy Balakrishnan

</box>

**Example:**
![events filter-c demo](images/events_filter-c.png)


| Parameter | Format                    | Examples (#g#Valid##/#r#Invalid##) |
|:---------:|---------------------------|------------------------------------|
| `KEYWORD` | Text up to 256 characters | #g#Hans##<br>#g#3##                |

<div style="page-break-after: always;"></div>

| #g#Positive Examples## | #r#Negative Examples## | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                 |
|:----------------------:|:----------------------:|---------------------------------------------------------------------------------------------------------------------------|
|    `filter-c alex`     |       `filter-c`       | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> <code>KEYWORD</code> is missing |
|  `filter-c aLeX rOy`   |                        |                                                                                                                           |

[Back to Events Management](#events-management)

#### <span style="color:#7725fa">Filtering events by `NAME`: Events Tab → `filter-n`

Shows a list of <span style="color:#7725fa">events</span> that contains the event `NAME` matching the `KEYWORD`.

Format: `filter-n KEYWORD [MORE_KEYWORDS]...`

> **RESULT:** Listed events with name containing `KEYWORD [MORE_KEYWORDS]` (found: _number of matched events_)

<box type="tip" seamless>

* The search is **case-insensitive**
* The search is by the <span style="color:#7725fa">event</span> <code>NAME</code>
* Only full keywords will be matched. e.g. <code>Con</code> will not match with <code>Conference</code>
> `cOnFerEnce` → 1. Conference with Bernice
* Event's name matching at least one keyword will be returned (i.e. OR search)
> `Conference Meeting` → 1. Conference with Bernice
>             2. Meeting with Alex
* The order of the keywords does not matter
> `Meeting Conference` → 1. Conference with Bernice
>             2. Meeting with Alex

</box>

**Example:**
![events filter-n demo](images/events_filter-n.png)

| Parameter | Format                    | Examples (#g#Valid##/#r#Invalid##) |
|:---------:|---------------------------|------------------------------------|
| `KEYWORD` | Text up to 256 characters | #g#Meeting##<br>#g#3##             |

| #g#Positive Examples## | #r#Negative Examples## | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                 |
|:----------------------:|:----------------------:|---------------------------------------------------------------------------------------------------------------------------|
|   `filter-n meeting`   |       `filter-n`       | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> <code>KEYWORD</code> is missing |
| `filter-n cOnFerence`  |                        |                                                                                                                           |


[Back to Events Management](#events-management)

<div style="page-break-after: always;"></div>

#### <span style="color:#7725fa">Filtering events by `TIME`: Events Tab → `filter-t`

Shows a list of all upcoming <span style="color:#7725fa">events</span> before `TIME`.

Format: `filter-t TIME`

> **RESULT:** You have _number of_ events between now and `TIME`.

<box type="tip" seamless>

All events with <code>START_TIME</code> before the time specified in <code>TIME</code> will be returned. e.g. `tmr noon` will return all
events starting before tomorrow noon (12 pm)

</box>

**Example:**
![events filter-t demo](images/events_filter-t.png)

|  Parameter  | Format                                                                            | Examples (#g#Valid##/#r#Invalid##) |
|:-----------:|-----------------------------------------------------------------------------------|------------------------------------|
| `TIME` | Refer to the accepted [accepted Date-time formats](#accepted-date-time-formats)   |                                    |

| #g#Positive Examples## | #r#Negative Examples## | <span style ='color: darkred; font-weight: bold;'>Reason for Error</span>                                                              |
|:----------------------:|:----------------------:|----------------------------------------------------------------------------------------------------------------------------------------|
|  `filter-t next week`  |  `filter-t my phone`   | <span style ='color: darkred; text-decoration: underline'>Invalid Date-Time Format</span><br> Date-time Format is incorrect for `TIME` |
| `filter-t 23-01-2024`  |       `filter-t`       | <span style ='color: darkred; text-decoration: underline'>Missing Parameter(s)</span><br> `TIME` is missing                            |

[Back to Events Management](#events-management)

<div style="page-break-after: always;"></div>

## Data Storage
--------------------------------------------------------------------------------------------------------------------


### Saving the Data

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

AddressBook, EventsBook, and FinanceBook data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

[↑ Back to Table of Contents](#table-of-contents)

### Editing the Data File

<span class="badge rounded-pill bg-danger" style="font-size: 14px; vertical-align: middle;">Advanced</span>

The following data are saved automatically as a JSON file. Advanced users are welcome to update data directly by editing that data file.
- AddressBook: `[JAR file location]/data/addressbook.json`
- EventsBook: `[JAR file location]/data/eventsbook.json`
- FinanceBook: `[JAR file location]/data/financebook.json`

<box type="warning" seamless>
<ul>
  <li>
    If your changes to the data file makes its format invalid, AddressBook, EventsBook and FinanceBook will discard all data and start with an empty data file at the next run (i.e. one corrupted file can wipe out the other files as well).  Hence, it is recommended to create a backup of the files before editing them.
  </li>
  <li>

FreelanceBuddy currently does not support client validation on loading data files. If you change client details on the FinanceBook and EventsBook, they may not correspond to client details on AddressBook! Here is our [explanation.](#faq)
  </li>
</ul>
</box>

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

### Configuration Files

<span class="badge rounded-pill bg-danger" style="font-size: 14px; vertical-align: middle;">Advanced</span>

FreelanceBuddy stores its configurations in two files; By default they are `config.json` and `preferences.json`.
While these files come with defaults that are tried and tested to be effective for everyday use, feel free to change some of their values.

<box type="warning" seamless>
<ul>
  <li>
    FinanceBuddy may fail to start if illegal values are given for the configuration.
  </li>
  <li>
    Particularly, there should not be any null values!
  </li>
</ul>
</box>

For `config.json`:
- `logLevel` : The logging level of the application. Default: `INFO`
- `userPrefsFilePath` : Determines the file that is used to read the user's preferences from. Default: `preferences.json`

| Config               | Description                                                            | Default            |
|----------------------|------------------------------------------------------------------------|--------------------|
| `logLevel`           | The logging level of the application.                                  | `INFO`             |
| `userPrefsFilePath`  | Determines the file that is used to read the user's preferences from.  | `preferences.json` |

<div style="page-break-after: always;"></div>

For the preferences file (which depends on the `userPrefsFilePath` in `config.json`):


| Config                          | Description                                                         | Default                  |
|---------------------------------|---------------------------------------------------------------------|--------------------------|
| `guiSettings.windowWidth`       | The width of FreelanceBuddy's GUI window.                           | `740.0`                  |
| `guiSettings.windowHeight`      | The height of FreelanceBuddy's GUI window.                          | `600.0`                  |
| `guiSettings.windowCoordinates` | The coordinates at which FreelanceBuddy is located on your display. | -                        |
| `addressBookFilePath`           | The filepath of the AddressBook data file.                          | `data\\addressbook.json` |
| `eventsFilePath`                | The filepath of the EventsBook data file.                           | `data\\eventsbook.json`  |
| `financeFilePath`               | The filepath of the FinanceBook data file                           | `data\\financebook.json` |

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

## Accepted Date-time Formats
--------------------------------------------------------------------------------------------------------------------

For the CLI experience to be optimised, FreelanceBuddy accepts a **variety of date-time formats** so that you can type in your date-time inputs **quickly** and **without hassle**.
Pick and choose any of your preferred format at your convenience.

#### Contents of this section

As this section is relatively long, we have provided a mini table of content for quick navigation.

- [Accepted Numbered Date Formats](#accepted-numbered-date-formats)
- [Accepted Natural Language Date Formats](#accepted-natural-language-date-formats)
- [Accepted Numbered Time Formats](#accepted-numbered-time-formats)
- [Accepted Natural Language Time Formats](#accepted-natural-language-time-formats)
- [Accepted Natural Language Date and Time Formats](#accepted-natural-language-date-and-time-formats)
- [Using Date and Time Inputs Together](#using-date-and-time-inputs-to-together)
- [Using Date-time Formats for Durations](#using-date-time-formats-for-durations)
- [Using Date-time Formats for Instances](#using-date-time-formats-for-time-instances)
- [Editing `START_TIME` `END_TIME` in Events ](#editing-start-time-end-time-in-events)<span class="badge rounded-pill bg-danger" data-v-4d146e2c=""><span aria-hidden="true" class="far fa-star" data-v-4d146e2c=""></span></span>

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

#### Accepted Numbered Date Formats

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

Below is a table of accepted numbered date formats, these represent `<DATE>` only.

|    Format    | Examples                   |  Case Sensitive?   |
|:------------:|----------------------------|:------------------:|
|  `d/M/yyyy`  | `1/1/2023`, `01/12/2023`   | :white_check_mark: |
|  `d-M-yyyy`  | `1-1-2023`, `01-12-2023`   | :white_check_mark: |
|   `d/M/yy`   | `1/1/23`, `01/12/12`       | :white_check_mark: |
|   `d-M-yy`   | `1-1-23`, `01-12-12`       | :white_check_mark: |
| `MMM d yyyy` | `Jan 1 2023`, `jan 1 2023` |        :x:         |
|  `MMM d yy`  | `Jan 1 23`, `jan 1 23`     |        :x:         |
| `d MMM yyyy` | `1 Jan 2023`, `1 jan 2023` |        :x:         |
|  `d MMM yy`  | `Jan 1 2023`, `1 jan 23`   |        :x:         |
|  `yyyy/M/d`  | `2023/1/1`, `2023/12/01`   | :white_check_mark: |
|   `yy/M/d`   | `23/1/1`, `23/12/01`       | :white_check_mark: |
|  `yyyy-M-d`  | `2023-1-1`, `2023-12-01`   | :white_check_mark: |
|   `yy-M-d`   | `23-1-1`, `23-12-01`       | :white_check_mark: |
|    `d/M`     | `1/1`, `01/12`             | :white_check_mark: |
|    `d-M`     | `1-1`, `01-12`             | :white_check_mark: |
|   `MMM d`    | `Jan 1`, `jan 1`           |        :x:         |
|   `d MMM`    | `1 Jan`, `jan 1`           |        :x:         |

> 🏷 ****Note**** inputs without year will be assumed to be the current year.

[Back to Date-time Contents](#contents-of-this-section)

<div style="page-break-after: always;"></div>

#### Accepted Natural Language Date Formats

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

Below is a table of accepted natural language date formats, these represent `<DATE>` only.

> 🏷 **Note:** all inputs are not case-sensitive.

|               Format                | Examples                      | Remarks                                                                                                     |
|:-----------------------------------:|-------------------------------|-------------------------------------------------------------------------------------------------------------|
|          `today`<br/>`tdy`          | -                             | Date of the current date                                                                                    |
|        `tomorrow`<br/>`tmr`         | -                             | Date of the next day with reference to current date                                                         |
|        `yesterday`<br/>`ytd`        | -                             | Date of the previous day with reference to current date                                                     |
|    `next <day/week/month/year>`     | `next day`                    | Date of the next specified timeframe with reference to current date                                         |
|         `next <DayOfWeek>`          | `next Mon`,<br/>`next Sunday` | Date of the next occurrence of the day of week specified<br/>Day of the week can be short-form (3 letters). |
| `in <number> <day/week/month/year>` | `in 5 days`,<br/>`in 1 week`  | Date of next specified timeframe with reference to current date                                             |

[Back to Date-time Contents](#contents-of-this-section)

<div style="page-break-after: always;"></div>

#### Accepted Numbered Time Formats

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

Below is a table of accepted numbered time formats, these represent `<TIME>` only.

> 🏷 ****Note**** all inputs are not case-sensitive.

|  Format  | Examples             |  Case Sensitive?   |
|:--------:|----------------------|:------------------:|
|  `HHmm`  | `1800`, `0600`       | :white_check_mark: |
| `HH:mm`  | `18:00`, `06:00`     | :white_check_mark: |
| `HH.mm`  | `18.00`, `06.00`     | :white_check_mark: |
|  `h a`   | `6 pm`, `6 PM`       | :white_check_mark: |
|   `ha`   | `6pm`, `6PM`         | :white_check_mark: |
| `h:mm a` | `6:00 PM`, `6:00 am` |        :x:         |
| `h:mma`  | `6:00pm`, `6:00AM`   |        :x:         |
| `h.mm a` | `6.00 pm`, `6.00 AM` |        :x:         |
| `h.mma`  | `6.00PM`, `6.00am`   |        :x:         |

[Back to Date-time Contents](#contents-of-this-section)

#### Accepted Natural Language Time Formats

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

Below is a table of accepted natural language time formats, these represent `<TIME>` only.

|   Format   | Examples | Remarks |
|:----------:|----------|---------|
|   `noon`   | -        | 12:00   |
| `midnight` | -        | 00:00   |

[Back to Date-time Contents](#contents-of-this-section)

<div style="page-break-after: always;"></div>

#### Accepted Natural Language Date and Time Formats

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

Below is a table of accepted natural language time formats, these represent `<DATE>` **AND** `<TIME>`!

> **Note for all inputs,**
> * they are not case-sensitive
> * they represent both a date and time

|             Format              | Examples                              | Remarks                                                                    |
|:-------------------------------:|---------------------------------------|----------------------------------------------------------------------------|
|              `now`              | -                                     | Date and time of instance that the command runs                            |
| `<number> <time_unit> from now` | `2 days from now`<br/>`1 hr from now` | Date and time from the specified timeframe of the instant the command runs |
|   `in <number> <hour/minute>`   | `in 30 mins`<br/>`in 1 hour`          | Date and time from the specified timeframe of the instant the command runs |

[Back to Date-time Contents](#contents-of-this-section)

<div style="page-break-after: always;"></div>

#### Using Date and Time Inputs to Together

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

In most cases, you may use date-only or time-only inputs, otherwise you may wish to combine the two.

A `<DATE> <TIME>` combination can be acheived in the following ways:

| Method                                                        |                                 Example                                 |
|---------------------------------------------------------------|:-----------------------------------------------------------------------:|
| Using  `<DATE> <TIME>` inputs                                 |              `now`<br/>`5 mins from now`<br/>`in 2 hours`               |
| Combining any valid<br/>`<DATE>` and `<TIME>` inputs together | `1-1-23 18:00`<br/>`1 Jan 23 18:00`<br/>`tmr 6pm`<br/>`next Sunday 6pm` |

> 🏷 ****TO NOTE**** `<DATE>` must **always** come before `<TIME>`

[Back to Date-time Contents](#contents-of-this-section)


#### Using Date-time Formats for Durations

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

Relevant for:
1. Creating <span style="color:#7725fa">Events</span> using `s/START_TIME` and `e/END_TIME` parameters.
2. `filter-t` method in <span style="color:#02bd5c">Finance</span> to get <span style="color:#02bd5c">Finance</span> record within specified timeframe.

<box type="info" seamless>

🏷 ****TO NOTE****<br>

There are several **rules** and [**assumptions**](#assumptions-when-using-date-time-combinations) that FreelanceBuddy date time reader makes use of that would be useful to understand to optimise your user experience.

</box>

[Back to Date-time Contents](#contents-of-this-section)

<div style="page-break-after: always;"></div>

##### <span style="color:#f79400">Accepted Date-time Combinations of `s/` and `e/`</span>

> `<DATE>` and `<TIME>` placeholder represents the `<DATE>` and `<TIME>` formats that are shown above.

|      `s/`       |      `e/`       |
|:---------------:|:---------------:|
| `<DATE> <TIME>` | `<DATE> <TIME>` |
| `<DATE> <TIME>` |    `<TIME>`     |
|    `<DATE>`     |    `<DATE>`     |
|    `<TIME>`     |    `<TIME>`     |
|    `<TIME>`     | `<DATE> <TIME>` |
| `<DATE> <TIME>` |    `<DATE>`     |
|    `<DATE>`     | `<DATE> <TIME>` |

> <span class="badge rounded-pill bg-success">Beginner</span> In general, just use a `s/` and `e/` combination that makes sense to you. A format that will always work is to **state your date and times explicitly** such as, `1 Jan 2023 17:00`.

**General Rules**:

1. You cannot start from a `<DATE>` to `<TIME>` or vice versa.
1. Following the assumptions, `e/` cannnot be earlier than `s/`.

[Back to Date-time Contents](#contents-of-this-section)

##### <span style="color:#f79400">Assumptions when using Date-time Combinations</span>

<span class="badge rounded-pill bg-danger" style="font-size: 14px; vertical-align: middle;">Advanced</span>

FreelanceBuddy streamlines the input process for the `s/` and `e/` parameters.

For instance, in the case of same-day <span style="color:#7725fa">events</span>, you'll only need to provide a date in the `s/` input field.
FreelanceBuddy will intelligently use this date as both the start and end date, _eliminating the need for redundant input_ in the `e/` field.

This feature hopes to **enhance efficiency** and **simplify the <span style="color:#7725fa">event</span> creation** process, creating a more **user-friendly** experience for you.

<div style="page-break-after: always;"></div>

Here is a list of all Date-time Combination Assumptions:

|           Input            | Assumptions                                                                                                                                                                                                                                                                                                              |
|:--------------------------:|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `s/<DATE> <TIME> e/<TIME>` | End date will be taken from the start date input. Start time must be before end time.<br/>**Example**: `s/tmr 6pm e/8pm` sets the event for tomorrow, 6-8pm.                                                                                                                                                             |
|    `s/<DATE> e/<DATE>`     | Time of start date will be set to 00:00, while end date will be set to 23:59.<br/>**Example**: `s/1 Jan 23 e/1 Jan 23` sets the event from 1st Jan 2023, 12am to 11:59pm                                                                                                                                                 |
|    `s/<TIME> e/<TIME>`     | Date of both start and end time will be set to the next occurrence of such a duration.<br/>**Example**: (Assume current time is 12pm)<br/>`s/9am e/10am` sets the event date to the next day as this duration has passed.<br/>`s/10am e/5pm` sets the event date to the current day as this duration has not yet passed. |
| `s/<TIME> e/<DATE> <TIME>` | Start date will be set to the date of the next occurrence of the specified time.<br/>**Example**: (Assume current time is 12pm)<br/>`s/9am e/tmr 10am` sets the event for tomorrow, 9-10am.<br/>`s/5pm e/tmr 5am` sets the event from today, 5pm to tomorrow 5am.                                                        |
| `s/<DATE> <TIME> e/<DATE>` | End date time will be set to 23:59.<br/>**Example**: `s/1 Jan 2023 9am e/1 Jan` sets the event for 1st Jan 2023, 9am to 11:59pm.                                                                                                                                                                                         |
| `s/<DATE> e/<DATE> <TIME>` | Start date time will be set to 00:00.<br/>**Example**: `s/1 Jan 2023 e/ 1 Jan 2023 5pm` sets the event for 1st Jan 2023, 12am to 5pm.                                                                                                                                                                                    |

[Back to Date-time Contents](#contents-of-this-section)

<div style="page-break-after: always;"></div>

#### Using Date-time Formats for Time Instances

<span class="badge rounded-pill bg-success" style="font-size: 14px; vertical-align: middle;">Beginner</span>

Relevant for:
1. Creating <span style="color:#02bd5c">Finance</span> entries with a specified time in the `t/TIME` parameter
2. `filter-t` command in <span style="color:#7725fa">Events</span> to get relevant <span style="color:#7725fa">Events</span> that are from now to the specified time.

You might want to consider the assumptions made for either `<DATE>` or `<TIME>` if either is left blank.

[Back to Date-time Contents](#contents-of-this-section)

##### <span style="color:#f79400">Assumptions when using Date-time Instance</span>

|      Input      | Assumptions                                      |
|:---------------:|--------------------------------------------------|
| `<DATE> <TIME>` | As specified                                     |
|    `<DATE>`     | Time is set to 12am of the specified date        |
|    `<TIME>`     | Date is set to next occurrence of specified time |

[Back to Date-time Contents](#contents-of-this-section)


#### Editing `START_TIME` `END_TIME` in Events

<span class="badge rounded-pill bg-danger" style="font-size: 14px; vertical-align: middle;">Advanced</span>

**Context**

When editing <span style="color:#7725fa">events</span> `START_TIME` `END_TIME` you may encounter the issue where keying in a valid `<DATE> <TIME>` is blocked.

<div style="page-break-after: always;"></div>

An example (Assume current datetime is 12-11-2023 5pm):

![editError](images/editTimeError.png =800x)

Even if the `START_TIME` *appears* to be before the stored `END_TIME`.

<box type="important">

Problem
</box>

1. **Reason for such an error message** is because it converts to the ==next possible datetime after now()==.
<br> See [Date-time Combinations Assumptions](#assumptions-when-using-date-time-combinations) for more details.
<br><br>Going back to our example:
<br>Given that today is 12-11-2023 and the time is 5pm, you enter `edit 1 s/3pm`.<br>
<table>
<tr>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</td>
<td>
<box>

****BEFORE EDITING****

1. Sample Event

   Start: 12-11-2023 16:00 </br> End: 12-11-2023 18:00

  </box>
</td>
<td>
---<code>edit 3 s/3pm</code>---> 
</td>

<td>

<box>

****AFTER EDITING****

1. Sample Event

   <span style="color:Red">Start: 13-11-2023 15:00</span> </br> End: 12-11-2023 18:00
</box>
</td>
</tr>
</table>

&nbsp; &nbsp; &nbsp; As shown above, the app registers "3pm" to <b>tomorrow</b> 3pm instead of today 3pm.

&nbsp; &nbsp; &nbsp; Now the start datetime is <b>LATER</b> than end datetime, which is clearly not allowed.


2. **Potentially dangerous** as you might not enter the date that you expected. 
<br>The problem extends beyond this specific example and can happen when modifying `END_TIME` only as well.

<div style="page-break-after: always;"></div>

<box type = "success">

**Solution**
</box>

Specify today's date explicitly (i.e. `s/13-11-2023 3pm` instead of `s/3pm`)


****A GOOD PRACTICE :white_check_mark:****

Modify `START_TIME` and `END_TIME` inputs together! If you understood how to use date-time Formats for Duration when [adding events or filtering finance inputs by timeframe](#using-date-time-formats-for-durations), it works the same way when modifying both inputs together for an event.

[Back to Date-time Contents](#contents-of-this-section)


<div style="page-break-after: always;"></div>

## Command summary

--------------------------------------------------------------------------------------------------------------------

<span class="badge rounded-pill bg-danger" style="font-size: 14px; vertical-align: middle;">Advanced</span>

A quick overview of all the commands and their formats.

_Click on the action to jump to the desired section!_

### General
Commands that applies to ALL tabs

| Action                                                              | Format, Examples                                                                          |
|---------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| [<p style="color:black">**Help**</p>](#viewing-help-help)           | `help`                                                          |
| [<p style="color:black">**Tab**</p>](#switching-tabs-tab)           | `tab TAB_NAME` <br> e.g., `tab contacts` |
| [<p style="color:black">**Exit**</p>](#exiting-the-program-exit)    | `exit`                                                    |
| [<p style="color:black">**Clear**</p>](#clearing-all-entries-clear) | `clear`                                                   |

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

### <span style="color:#a30039">Contacts Tab</span>

| Action                                                                                                   | Format, Examples                                                                                                                                                                                                 |
|----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [<p style="color:black">**List all contacts**</p>](#listing-all-contacts-contacts-tab-list)              | `list`                                                                                                                                                                 |
| [<p style="color:black">**Add**</p>](#adding-a-contact-contacts-tab-add)                                 | `add n/NAME p/PHONE_NUMBER e/EMAIL [a/ADDRESS] [c/COMPANY] [t/TELEGRAM_NAME]` <br> e.g., `add n/‘Chewbaca’ The 1st p/+659123139 e/chewie@gmail.com` |
| [<p style="color:black">**Edit**</p>](#editing-a-contact-contacts-tab-edit)                              | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [c/COMPANY] [t/TELEGRAM_NAME]` <br/> e.g., `edit 2 n/Betsy Crower t/`	            |
| [<p style="color:black">**Delete**</p>](#deleting-a-contact-entry-contacts-tab-delete)                   | `delete INDEX` <br> e.g., `delete 1`                                                                                     |
| [<p style="color:black">**Filter by Name**</p>](#filtering-contacts-by-name-contacts-tab-filter-n)       | `filter-n KEYWORD [MORE_KEYWORDS]…​` <br> e.g., `filter-n David Li`                                                          |
| [<p style="color:black">**Filter by Company**</p>](#filtering-contacts-by-company-contacts-tab-filter-c) | `filter-c KEYWORD [MORE_KEYWORDS]…​` <br> e.g., `filter-c Google`                                                            |

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

### <span style="color:#02bd5c">Finance Tab</span>

| Action                                                                                                                             | Format, Examples                                                                                                                |
|------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|
| [<p style="color:black">**List**</p>](#listing-finances-finance-tab-list)                                                          | `list [TYPE]`<br> e.g., `list commission`                                                                                       |
| [<span style="color:black">**Add**</span> <span style="color:green">**Commission**</span>](#adding-a-commission-finance-tab-add-c) | `add-c d/DESCRIPTION a/AMOUNT c/CLIENT [t/TIME]` <br> e.g., `add-c n/Betsy Crower a/800 d/UI design for NinjaVan t/tmr`         |
| [<span style="color:black">**Add**</span> <span style="color:red">**Expense**</span>](#adding-an-expense-finance-tab-add-e)        | `add-e d/DESCRIPTION a/AMOUNT [c/CLIENT] [t/TIME]` <br> e.g., `add-e n/Betsy Crower a/100 d/Adobe Photoshop subscription t/now` |
| [<p style="color:black">**Edit**</p>](#editing-a-finance-finance-tab-edit)                                                         | `edit INDEX [d/DESCRIPTION] [a/AMOUNT] [c/CLIENT] [t/TIME]` <br/> e.g., `edit 1 d/Photoshop subscription a/300`                 |
| [<p style="color:black">**Delete**</p>](#deleting-a-finance-entry-finance-tab-delete)                                              | `delete INDEX`<br> e.g., `delete 3`             |
| [<p style="color:black">**Filter by Client Name**</p>](#filtering-finances-by-client-finance-tab-filter-c)                         | `filter-c KEYWORD`<br> e.g., `filter-c John`             |
| [<p style="color:black">**Filter by Time Frame**</p>](#filtering-finances-by-time-frame-finance-tab-filter-t)                      | `filter-t s/START_TIME e/END_TIME`<br> e.g., `filter-t s/tdy e/next week`               |
| [<p style="color:black">**Summary**</p>](#generating-a-finance-summary-of-a-client-finance-tab-summary)                            | `summary CLIENT`<br> e.g., `summary John Doe`          |

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

### <span style="color:#7725fa">Events Tab</span>

| Action                                                                                                  | Format, Examples                                                                                                                                                              |
|---------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [<p style="color:black">**List Upcoming**</p>](#listing-all-upcoming-events-events-tab-list)            | `list`                                                                                                                                                                        |
| [<p style="color:black">**List All**</p>](#listing-all-events-events-tab-list-all)                      | `list-all`<br> e.g., `list-all`                                                                                                                                               |
| [<p style="color:black">**Add**</p>](#adding-an-event-events-tab-add)                                   | `add n/NAME s/START_TIME e/END_TIME [c/CLIENT] [l/LOCATION] [d/DESCRIPTION]` <br> e.g., `add n/Tennis s/31-09-2023 19:30 e/31-09-2023 21:30 l/20 Lower Kent Ridge Road, 119080` |
| [<p style="color:black">**Edit**</p>](#editing-an-event-events-tab-edit)                                | `edit INDEX [n/NAME] [s/START_TIME] [e/END_TIME] [c/CLIENT]…​ [l/LOCATION] [d/DESCRIPTION]` <br/> e.g., `edit 1 n/Tennis`                                                       |
| [<p style="color:black">**Delete**</p>](#deleting-an-event-entry-events-tab-delete)                     | `delete INDEX`<br> e.g., `delete 3`                                                                                                                                           |
| [<p style="color:black">**Filter by Client Name**</p>](#filtering-events-by-client-events-tab-filter-c) | `filter-c KEYWORD`<br> e.g., `filter-c Alex`                                                                                                                                  |
| [<p style="color:black">**Filter by Event Name**</p>](#filtering-events-by-name-events-tab-filter-n)    | `filter-n KEYWORD`<br> e.g., `filter-n birthday`                                                                                                                              |
| [<p style="color:black">**Filter by Time**</p>](#filtering-events-by-time-events-tab-filter-t)          | `filter-t TIME`<br> e.g., `filter-t next week`                                                                                                                           |

[↑ Back to Table of Contents](#table-of-contents)

<div style="page-break-after: always;"></div>

## FAQ
--------------------------------------------------------------------------------------------------------------------


**Q**: **How do I transfer my data to another Computer?**</br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous FreelanceBuddy home folder.</br>

**Q**: **My GUI seems to be appearing off-screen, why does this happen and how do I fix this?**</br>
**A**: This problem occurs after you have moved the application to a secondary screen when using multiple screens, and then switched to using only the primary screen. To fix this, simply delete the `preferences.json` file created by the application before running the application again.</br>

**Q**: **Why is it that after I update or delete a contact, the changes are not displayed on the Finance or Event tabs?** </br>
**A**: FreelanceBuddy currently does not support propagation of changes from Contact Tab to the other tabs. Moreover, there is often a need for users to keep track of old transactions or appointments with clients that may not exist anymore, or exist as a different entity in the database.

**Q**: **Why does the input not accept $ for finance / Why is the $ sign not shown in Finance Tab?**</br>
**A**: We don't want to discriminate other types of currencies that we may have missed out

Still having issues? Please email us at freelancebuddy@gmail.com

[↑ Back to Table of Contents](#table-of-contents)
