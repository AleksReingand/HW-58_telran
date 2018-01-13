package telran.persons.controller;


public class PersonData {
	
	protected static String[] cities = { "Acre", "Afula", "Arad", "Ariel", "Ashdod", "Ashkelon", "Bat Yam", "Beersheva",
			"Beit Shean", "Beit Shemesh", "Beitar Illit", "Bnei Brak", "Dimona", "Eilat", "Elad", "Givat Shmuel",
			"Givatayim", "Hadera", "Haifa", "Herzliya", "Hod HaSharon", "Holon", "Jaffa", "Jerusalem", "Karmiel",
			"Kiryat Arba", "Kiryat Ata", "Kiryat Bialik", "Kiryat Gat", "Kiryat Malakhi", "Kiryat Motzkin",
			"Kiryat Ono", "Kiryat Shmona", "Kiryat Tivon", "Kiryat Yam", "Kfar Saba", "Lod", "Maale Adumim",
			"Maalot-Tarshiha", "Metula", "Migdal HaEmek", "Modiin-Maccabim-Reut", "Modiin Illit", "Nahariya",
			"Nazareth Illit", "Nesher", "Ness Ziona", "Netanya", "Netivot", "Ofakim", "Or Akiva", "Or Yehuda",
			"Petah Tikva", "Raanana", "Ramat Gan", "Ramat HaSharon", "Ramla", "Rehovot", "Rishon LeZion", "Rosh HaAyin",
			"Rosh Pina", "Safed", "Sderot", "Tel Aviv", "Tiberias", "Tirat Carmel", "Yavne", "Yehud-Monosson",
			"Yokneam", "Zikhron Yaakov" };

	protected static String[] streets = { "Allenby Street", "Begin Road", "Ben Yehuda Street", "Dizengoff Street",
			"HaMasger Street", "HaYarkon Street", "Ibn Gabirol Street", "King George Street", "Nahalat Binyamin Street",
			"Rothschild Boulevard Sderot", "Yerushalayim Yefet Street", "Sokolov", "Prof. Plaut", "HaArba'a Street",
			"Frishman Street", "Kaplan Street", "Sheinkin Street", "Ayalon", "Highway", "HaPalmach", "Emek Refaim",
			"Ma'ale HaShalom", "Straus Street", "Gaza Street" };

	protected static String[] name = { "Aaron", "Abraham", "Adam", "Adrian", "Aidan", "Alan", "Albert", "Alejandro",
			"Alex", "Alexander", "Alfred", "Andrew", "Angel", "Anthony", "Antonio", "Ashton", "Austin	", "Aaliyah",
			"Abigail", "Ada", "Adelina", "Agatha", "Alexa", "Alexandra", "Alexis", "Alise", "Allison", "Alyssa",
			"Amanda", "Amber", "Amelia", "Angelina", "Anita", "Ann", "Ariana", "Arianna", "Ashley", "Audrey", "Autumn",
			"Ava", "Avery", "Benjamin", "Bernard", "Blake", "Brandon", "Brian", "Bruce", "Bryan	", "Bailey", "Barbara",
			"Beatrice", "Belinda", "Brianna", "Bridjet", "Brooke", "Cameron", "Carl", "Carlos", "Charles",
			"Christopher", "Cole", "Connor", "Caleb", "Carter", "Chase", "Christian", "Clifford", "Cody", "Colin",
			"Curtis", "Cyrus	", "Carolinev", "Catherine", "Cecilia", "Celia", "Chloe", "Christine", "Claire",
			"Daniel", "David", "Dennis", "Devin", "Diego", "Dominic", "Donald", "Douglas", "Dylan	", "Daisy",
			"Danielle", "Deborah", "Delia", "Destiny", "Diana", "Dorothy", "Edward", "Elijah", "Eric", "Ethan",
			"Evan	", "Eleanor", "Elizabeth", "Ella", "Emily", "Emma", "Erin", "Evelyn", "Francis", "Fred	", "Faith",
			"Fiona", "Florence", "Freda", "Gabriel", "Gavin", "Geoffrey", "George", "Gerld", "Gilbert", "Gordon",
			"Graham", "Gregory	", "Gloria", "Gabriella", "Gladys", "Grace", "Harold", "Harry", "Hayden", "Henry",
			"Herbert", "Horace", "Howard", "Hugh", "Hunter	", "Hailey", "Haley", "Hannah", "Helen", "Ian", "Isaac",
			"Isaiah	", "Isabel", "Isabella", "Jack", "Jackson", "Jacob", "Jaden", "Jake", "James", "Jason", "Jayden",
			"Jeffery", "Jeremiah", "Jesse", "Jesus", "John", "Jonathan", "Jordan", "Jose", "Joseph", "Joshua", "Juan",
			"Julian", "Justin	", "Jacqueline", "Jada", "Jane", "Jasmine", "Jenna", "Jennifer", "Jessica", "Jocelyn",
			"Jordan", "Josephine", "Joyce", "Julia", "Keith", "Kevin", "Kyle", "Kaitlyn", "Katelyn", "Katherine",
			"Kathryn", "Kayla", "Kaylee", "Kimberly", "Kylie", "Landon", "Lawrence", "Leonars", "Lewis", "Louis",
			"Lucas", "Luke	", "Laura", "Lauren", "Leah", "Leonora", "Leslie", "Lillian", "Lily", "Linda", "Lorna",
			"Luccile", "Lucy", "Lynn", "Malcolm", "Martin", "Mason", "Matthew", "Michael", "Miguel", "Miles",
			"Morgan	", "Mabel", "Mackenzie", "Madeline", "Madison", "Makayla", "Margaret", "Maria", "Marisa",
			"Marjorie", "Mary", "Melanie", "Melissa", "Mia", "Michelle", "Mildred", "Molly", "Monica", "Nathan",
			"Nathaniel", "Neil", "Nicholas", "Noah", "Norman	", "Nancy", "Natalie", "Nicole", "Nora", "Oliver",
			"Oscar", "Oswald", "Owen	", "Olivia", "Patrick", "Peter", "Philip	", "Paige", "Pamela", "Patricia",
			"Pauline", "Penelope", "Priscilla", "Ralph", "Raymond", "Reginald", "Richard", "Robert", "Rodrigo", "Roger",
			"Ronald", "Ryan	", "Rachel", "Rebecca", "Riley", "Rita", "Rosalind", "Rose", "Samuel", "Sean", "Sebastian",
			"Seth", "Simon", "Stanley", "Steven	", "Samantha", "Sandra", "Sara", "Sarah", "Savannah", "Sharon",
			"Sheila", "Shirley", "Sierra", "Sofia", "Sophia", "Stephanie", "Susan", "Sybil", "Sydney", "Sylvia",
			"Thomas", "Timothy", "Tyler	", "Taylor", "Trinity", "Vanessa", "Victoria", "Violet", "Virginia" };

	protected static String[] company = { "Bank Of Israel", "Berkshire Hathaway", "Wells Fargo", "Apple", "IBM",
			"Motorolla", "Tel Ran", "Macaby", "Intel", "ISCAR", "Israel Aerospace Industries", "El Al", "SIPRI",
			"Elbit Systems Israel", "HP", "Shufersal", "Self employed", "Kneset" };

	protected static String[] kindergarten = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

}
