# JomMakan
list of restaurants and their hours of openings. Create a list view (or a recycler view) in an Android application that loads this data remotely and displays the restaurant name and its current operation state (Open or Closed). Upon tapping on the restaurant, shows the full list of its operating hours.

## API RESPONSE  
``` 
{
   "timestamp":1635627214,
   "restaurants":[
      {
         "name":"Go Noodle House",
         "operatingHours":"Mon-Sun 11:30 am - 9:00 pm"
      },
      {
         "name":"The Beato Dry Aged Steakhouse",
         "operatingHours":"Mon-Sun 11:00 am - 9:30 pm"
      },
      {
         "name":"myBurgerLab Seapark",
         "operatingHours":"Mon-Fri 11:00 am - 10:00 pm  \/ Sat-Sun 5:00 pm - 10:00 pm"
      },
      {
         "name":"Hokkaido Seafood Restaurant",
         "operatingHours":"Mon-Sun 11:00 am - 11:00 pm"
      },
      {
         "name":"Bariuma Ramen",
         "operatingHours":"Mon-Thu 11:00 am - 10:30 pm  \/ Fri 11:00 am - 11:00 pm  \/ Sat 11:30 am - 11:00 pm  \/ Sun 4:30 pm - 10:30 pm"
      },
      {
         "name":"Village Park",
         "operatingHours":"Mon-Thu, Sun 11:30 am - 10:00 pm  \/ Fri-Sat 11:30 am - 11:00 pm"
      },
      {
         "name":"Shin Nihon Yakiniku",
         "operatingHours":"Mon-Thu, Sun 11:30 am - 10:00 pm  \/ Fri-Sat 11:30 am - 11:00 pm"
      },
      {
         "name":"The Tokyo Restaurant",
         "operatingHours":"Mon-Fri 10:00 am - 9:30 pm  \/ Sat-Sun 9:30 am - 9:30 pm"
      },
      {
         "name":"Nobu Kuala Lumpur",
         "operatingHours":"Mon-Thu, Sun 11:30 am - 9:00 pm  \/ Fri-Sat 11:30 am - 10:00 pm"
      },
      {
         "name":"Ali, Muthu & Ah Hock",
         "operatingHours":"Mon-Thu, Sun 11:30 am - 9:00 pm  \/ Fri-Sat 11:30 am - 9:30 pm"
      },
      {
         "name":"Lan Je Steamed Fish Restaurant",
         "operatingHours":"Mon-Fri 10:30 am - 9:30 pm  \/ Sat-Sun 10:00 am - 9:30 pm"
      },
      {
         "name":"Ramen Seirock-ya Uptown",
         "operatingHours":"Mon-Sun 11:30 am - 9:30 pm"
      },
      {
         "name":"Tony Roma's Restaurant",
         "operatingHours":"Mon-Sat 11:30 am - 10:00 pm  \/ Sun 5:30 pm - 10:00 pm"
      },
      {
         "name":"Pizza Hut",
         "operatingHours":"Mon-Sun 11:00 am - 10:00 pm"
      },
      {
         "name":"Nasi Lemak Tanglin",
         "operatingHours":"Mon-Thu, Sun 9:00 am - 10:00 pm  \/ Fri-Sat 9:00 am - 11:00 pm"
      },
      {
         "name":"Murni Discovery",
         "operatingHours":"Mon-Thu 11:30 am - 10:00 pm  \/ Fri-Sun 11:30 am - 11:00 pm"
      },
      {
         "name":"Sid's Pub @ Plaza Damansara",
         "operatingHours":"Mon-Fri 11:30 am - 10:00 pm  \/ Sat 5:00 pm - 10:00 pm"
      },
      {
         "name":"Atelier on Talawi",
         "operatingHours":"Mon-Sun 11:00 am - 10:00 pm"
      },
      {
         "name":"La Juiceria Superfoods Signature",
         "operatingHours":"Mon-Fri 11:30 am - 10:00 pm  \/ Sat 5:30 pm - 10:00 pm"
      },
      {
         "name":"Salad Atelier Cafe",
         "operatingHours":"Mon-Sun 11:30 am - 10:00 pm"
      },
      {
         "name":"Mikoshi Shabu Shabu Restaurant",
         "operatingHours":"Mon-Sun 11:30 am - 10:00 pm"
      },
      {
         "name":"Penang Garden",
         "operatingHours":"Mon-Thu 11:00 am - 10:00 pm  \/ Fri-Sat 10:00 am - 10:30 pm  \/ Sun 11:00 am - 11:00 pm"
      },
      {
         "name":"The Coffee Bean & Tea Leaf",
         "operatingHours":"Mon-Sun 11:00 am - 11:00 pm"
      },
      {
         "name":"Two Sons Bistro",
         "operatingHours":"Mon-Sat 11:00 am - 11:00 pm  \/ Sun 11:00 am - 10:00 pm"
      },
      {
         "name":"JungleBird",
         "operatingHours":"Mon-Fri 12:00 pm - 10:00 pm  \/ Sat-Sun 5:00 pm - 10:00 pm"
      },
      {
         "name":"Breakfast Thieves APW Bangsa",
         "operatingHours":"Mon-Fri 11:30 am - 10:00 pm  \/ Sat-Sun 7:00 am - 3:00 pm"
      },
      {
         "name":"Victoria Station Restaurant",
         "operatingHours":"Mon-Thu, Sun 11:30 am - 9:30 pm  \/ Fri-Sat 11:30 am - 10:00 pm"
      },
      {
         "name":"Berkeley Kampong Food Court",
         "operatingHours":"Mon-Sun 11:00 am - 10:30 pm"
      },
      {
         "name":"Two Pesos Restaurant",
         "operatingHours":"Mon-Sun 11:00 am - 10:30 pm"
      },
      {
         "name":"Donkey & Crow Irish Pub Bangsar",
         "operatingHours":"Mon-Sun 10:00 am - 11:00 pm"
      },
      {
         "name":"Tong Palace",
         "operatingHours":"Mon-Fri 9:00 am - 9:30 pm  \/ Sat-Sun 9:00 am - 10:00 pm"
      },
      {
         "name":"Sushi Mentai",
         "operatingHours":"Mon-Sun 11:00 am - 11:00 pm"
      },
      {
         "name":"IPPUDO @ Pavillion",
         "operatingHours":"Mon-Sun 11:30 am - 10:30 pm"
      },
      {
         "name":"McDonalds",
         "operatingHours":"Mon-Thu, Sun 11:30 am - 10:00 pm  \/ Fri-Sat 11:30 am - 11:00 pm"
      },
      {
         "name":"Keong Kee Herbal Soup",
         "operatingHours":"Mon-Sat 11:00 am - 11:00 pm  \/ Sun 11:00 am - 10:30 pm"
      },
      {
         "name":"Huckleberry Food and Fare",
         "operatingHours":"Mon-Thu, Sun 11:30 am - 10:00 pm  \/ Fri-Sat 11:30 am - 10:30 pm"
      },
      {
         "name":"Prime Steak Restaurant",
         "operatingHours":"Mon-Sat 11:00 am - 10:00 pm  \/ Sun 12:00 pm - 10:00 pm"
      },
      {
         "name":"Hameediyah Bistro Ampang",
         "operatingHours":"Mon-Sun 8:00 am - 10:30 pm"
      },
      {
         "name":"Unique Seafood Restaurant",
         "operatingHours":"Mon-Fri 11:00 am - 9:00 pm  \/ Sat 5:00 pm - 9:00 pm"
      },
      {
         "name":"Betel Leaf",
         "operatingHours":"Mon-Thu, Sun 11:00 am - 10:00 pm  \/ Fri-Sat 11:00 am - 11:00 pm"
      },
      {
         "name":"Asian Fast Food Mixed Rice",
         "operatingHours":"Mon, Wed-Sun 11:00 am - 10:00 pm"
      }
   ]
}
```

## Input:
```
time: 11:30pm
data: "Ali, Muthu & Ah Hock","Mon-Thu, Sun 11:30 am - 9:00 pm  / Fri-Sat 11:30 am - 9:30 pm"
```

## Output 1: (List Screen)
```
Ali, Muthu & Ah Hock
Closed
```

## Output 2: (Details Screen)
```
Ali, Muthu & Ah Hock
Mon 11:30 am - 9:00 pm
Tue 11:30 am - 9:00 pm
Wed 11:30 am - 9:00 pm
Thu 11:30 am - 9:00 pm
Fri 11:30 am - 9:30 pm
Sat 11:30 am - 9:30 pm
Sun 11:30 am - 9:00 pm
```

