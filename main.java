// class Main  {
 // public static void main(string[] args) {
    //System.out.println(x:"Hello World");
 // }
//}

/*
counter = 0
seatLetter=A
row=1
for every passenger in the manifest assign row, seatLetter to the passenger
  seatLetter = seatLetter +1 // move to next seat
  coutner = counter +1 //incr. counter of seated passenger 
  if counter >3 // 4 passengers seated already
    counter = 0 //reset coutner for next 4 passengers
    seatLetter = 'A' // reset seating to leftmost seat
    row = row +1 // move to next row
*/
class Main {
  static String[] passenger =
  "bella", 
  "bob",
  "john",
  "jake"
};

  static final char LEFTMOST_SEAT = 'A';

  public state void main(String[] args) {
    int counter = 0;
    char seatLetter= LEFTMOST_SEAT;
    int row = 1;
    // fro every passener inteh manifest 
    for (int i = 0; i < passengers.length; i++) {
      // Assign current passenger to row and seatLetter  
      System.out.printf(format:"\nSeat: %d%s for passenger" row, seatLetter, passengers[i]);
      if (counter >3) { // if 4 passengers seated already
        counter = 0; // reset coutner for the next 4 passengers
        seatLetter = (char)((int)(seatLetter)+1); //start at the leftmost 
        row = row + 1; //move to next row
      }
    }
    
