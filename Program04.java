
/*
 * Programmer: Pravesh Jung Karki
 * Description: This application will have 5 classes in
 * total ( including main ). One class is a deque. It is a
 * double
 * ended queue where both insertion and deelection is
 * possible from both end. So, with the help of deque we
 * crete stack and queue class.
 * There is one more class which is a customer class that
 * helps us to crete a deck of a customer. So, wee will
 * provide 3 option
 * for user. So option one will provide the option to the
 * user where they can manipulate queue, stack and deque as
 * per their needs.
 * Option two is a game "Top Trump" and option three
 * contains the option to exit the program.
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class Program04 {

   public static Scanner keyboard = new Scanner( System.in );

   public static void main(String[] args) {

      int Option; // to hold several options
      int Opt; // to hold option for either deck,stack or
               // queue
      String str = ""; // to hold the string for queue
      char again; // to repeat the process
      String result; // to hold the result
      String name = ""; // to hold customer name
      int id = 0; // to hold customer id
      String string; // to hold string for queue
      int integer; // to hold an integer for stack
      Object delect; // to hold value after delection
      int choose; // to select different option for user.

      // creating an object of a Deque class where d1 is a
      // reference varaible.
      Deque d1 = new Deque();
      // creating an object of a Queue class where d2 is a
      // reference varaible.
      Queue d2 = new Queue();
      // creating an object of a Stack class where d3 is a
      // reference varaible.
      Stack d3 = new Stack();

      System.out.println("This application will provide you three different option." );
      System.out.println("Option 1 will provide you to manipulate deque,queue or stack. " );
      System.out.println( "It will provide you many option that you can choose." );
      System.out.println("Option 2 will have an option to play \"Top-Trump\" game" );
      System.out.println( "Option 3 is where you can quit the application." );
      System.out.println();
      System.out.println( "************ LET'S START***********" );
      // Providing three different option for user....
      do{
      System.out.println();
      System.out.println( "Which option do you like to choose " );
      System.out.println( "ENTER - 1 => Test the tools" );
      System.out.println( "ENTER - 2 => Play \"Top Trump\"" );
      System.out.println( "ENTER - 3 => Quit" );
      choose = keyboard.nextInt();

      // if user selects option 1 to manipulate deque, stack
      // or queue............
      if ( choose == 1 ) {
         System.out.println( "Welcome to TEST-TOOLS. Here you can find " );
         System.out.println( "DEEQUE , QUEUE AND STACK " );
         System.out.println("So, you can do the neecessary operations in any  of this at any time" );
         System.out.println( "Let's begin..." );
         System.out.println();
         do {
            // calling getOption method that will provide 3
            // menu for the user.
            Opt = getOption();
            System.out.println();
            System.out.println( "Available operations:" );
            if ( Opt == 1 ) {
               System.out.println("Enter 1. Insert from front\nEnter 2. Insert from  back " );
               System.out.println("Enter 3. Delect from front\nEnter 4. Delect from back " );
               System.out.println("Enter 5. String summarizing entire contents" );
               System.out.println("Enter 6. String summarizing entire contents of deque storage" );
               System.out.println("Enter 7. Returns true if deque is empty." );
               System.out.println("Enter 8. Inilialize an empty deque." );
            }
            else if ( Opt == 2 ) {
               System.out.println( "Enter 2. Insert from  back " );
               System.out.println( "Enter 3. Delect from front " );
               System.out.println( "Enter 5. String summarizing entire contents" );
               System.out.println( "Enter 7. Returns true if queue is empty." );
               System.out.println( "Enter 8. Inilialize an empty queue." );

            }
            else if ( Opt == 3 ) {
               System.out.println( "Enter 1. Push from  front " );
               System.out.println( "Enter 3. Pop from  front " );
               System.out.println( "Enter 5. String summarizing entire contents" );
               System.out.println( "Enter 7. Returns true if stack is empty." );
               System.out.println( "Enter 8. Inilialize an empty stack." );

            }

            System.out.print( "Enter any number from above: " );
            Option = keyboard.nextInt();

            /**
             * for option 1 or 2 if it is for a deque then
             * option 1 will insert from front
             * or if it's option 2 insert from back and do
             * the same thing for all other
             * class except customer.
             * 
             */

            if ( Option == 1 || Option == 2 ) {
               if ( Opt == 1 ) {
                  System.out.println();
                  System.out.println( "Enter the name of customer: " );
                  name = keyboard.next();
                  System.out.println( "Enter the id of customer: " );
                  id = keyboard.nextInt();
                  // creating an object of a customer class
                  // and send name and id
                  // as an argument.
                  Customer c = new Customer( name, id );

                  if ( Option == 1 ) {
                     System.out.println();
                     d1.insertOnFront( c );
                     System.out.println("The costumer from the front has been successfully added..." );

                  }
                  else {
                     System.out.println();
                     d1.insertOnBack( c );
                     System.out.println("The costumer from the back has been successfully added..." );

                  }
               }

               else if ( Opt == 2 ) {
                  if ( Option == 2 ) {
                     string = keyboard.next();
                     d2.insert( string );
                     System.out.println(
                           "The string on the back has been successfully added..." );
                     System.out.println();

                  }
                  else
                     System.out.println(
                           "Not a valid option.Select the right option from above..." );
               }

               else if ( Opt == 3 ) {

                  if ( Option == 1 ) {
                     integer = keyboard.nextInt();
                     d3.push( integer );
                     System.out.println(
                           "The integer from the front as been added successfully..." );
                     System.out.println();

                  }
                  else
                     System.out.println(
                           "Not a valid option.Select the right option from above..." );

               }

            }
            else if ( Option == 3 || Option == 4 ) {
               Customer deletedItem = null;
               if ( Opt == 1 ) {
                  if ( Option == 3 ) {
                     delect = d1.delectFromFront();
                     System.out.println(
                           "The costumer from the front as been successfully removed..." );
                     if ( delect instanceof Customer )
                        deletedItem = (Customer) delect;
                     else
                        System.out.println( "Error not a valid object" );
                     System.out.println(
                           "Removed item ID => " + deletedItem.getID() );
                     System.out.println();

                  }
                  else {
                     delect = d1.delectFromBack();
                     System.out.println(
                           "The costumer from the back as been successfully removed..." );
                     if ( delect instanceof Customer )
                        deletedItem = (Customer) delect;
                     else
                        System.out.println( "Error not a valid object" );
                     System.out.println(
                           "Removed item ID => " + deletedItem.getID() );
                     System.out.println();
                     
                  }
               }

               if ( Opt == 2 ) {

                  if ( Option == 3 ) {

                     delect = d2.delect();
                     System.out.println(
                           "The string from the front as been successfully removed..." );
                     System.out.println( "Removed item => " + delect );
                     System.out.println();

                  }
                  else
                     System.out.println(
                           "Not a valid option.Select the right option from above..." );

               }

               else if ( Opt == 3 ) {

                  if ( Option == 3 ) {
                     delect = d3.pop();
                     System.out.println(
                           "The integer from the front as been successfully removed..." );
                     System.out.println( "Removed item => " + delect );
                     System.out.println();

                  }
                  else
                     System.out.println(
                           "Not a valid option.Select the right option from above..." );

               }
            }

            else if ( Option == 5 ) {

               if ( Opt == 2 ) {
                  System.out.println();
                  System.out.println(
                        "String summarizing the entire content has been displayed..." );
                  System.out.println( d2 );

               }
               else if ( Opt == 3 ) {
                  System.out.println();
                  System.out.println(
                        "String summarizing the entire content has been displayed..." );
                  System.out.println( d3 );

               }
               else {
                  System.out.println();
                  System.out.println(
                        "String summarizing the entire content has been displayed..." );
                  System.out.println( d1 );

               }
            }

            else if ( Option == 6 ) {
               if ( Opt == 1 ) {
                  System.out.println(
                        "String summarizing entire contents of deque storage has been displayed." );
                  System.out.println( d1.toStore() );
               }
               else
                  System.out.println(
                        "Not a valid option.Select the right option from above..." );

            }
            else if ( Option == 7 ) {
               boolean empty;
               if ( Opt == 1 ) {
                  empty = d1.isEmpty();
                  System.out.println( empty );
               }
               else if ( Opt == 2 ) {
                  empty = d2.isEmpty();
                  System.out.println( empty );
               }

               else {
                  empty = d3.isEmpty();
                  System.out.println( empty );
               }
               System.out.println(
                     "If the above result is  true i.e Empty if false then it is not empty." );
               System.out.println();
            }

            else if ( Option == 8 ) {
               if ( Opt == 1 )
                  d1 = new Deque();
               else if ( Opt == 2 )
                  d2 = new Queue();
               else
                  d3 = new Stack();
               System.out.println();
               System.out.println(
                     "New instance has been initialized successfully..." );
               System.out.println();

            }
            System.out.println( " Do you like to do for another option(y/n)?" );
            again = keyboard.next().toLowerCase().charAt( 0 );
         } while ( again == 'y' );

         // if user selects to play the game........
      }
      else if ( choose == 2 ) {

         System.out.println( "*****Welcome to the \"TOP-TRUMP\" game*****" );
         System.out.println(
               "This game will be played between you and the computer starting with 15 cards each." );
         System.out.println(
               "So, you will go first and switch the turn afterwards." );
         System.out.println(
               "So, at first dealt the card from top of the hand  and select a category " );
         System.out.println(
               "and read the value. Then other player will compare the value of the same " );
         System.out.println(
               "catagory from their cards. The best value will win the trick and the winner " );
         System.out.println(
               "takes all the acrds of teh trick and places them at the bottom of your hand/pile." );
         System.out.println(
               "In case of draw both the cards will be placed in center and another card is dealt " );
         System.out.println(
               "and repeat the process. Whoever wins will get all the cards( including center )." );
         System.out.println(
               "The player with all the cards will win the game." );
         // declaring all the necessary variables

         Object playerCard; // store return card from delect method
         Object computerCard; // store return card from delect method
         int properties; // to hold properties of the card
         GreekHero playerC = null; // to hold playerCard
                                   // after converting
         GreekHero computerC = null; // to hold computerCard
                                     // after converting
         int comCompare; // to hold computer return int for
                         // computer
         int playerCompare; // to hold player return int
         boolean turn = false; // to hold the turn
         int playerNumber = 15; // to hold player number of
                                // cards
         int computerNumber = 15; // to hold computer number
                                  // of cards
         Random randomNumber = new Random();// for the random
                                           // computer properties.
         int equal = 1; // to check if properties are equal
         GreekHero storePlayerCard = null; // to store
                                           // player card
         GreekHero storeComputerCard = null;// to store
                                            // computer card
         int size = 0; // to storee the size for center card
         Object delected; // to hold delected card
         char quit = '\0'; // initialize to 0

         // creating an object of queue as a deck for the
         // cards
         Queue deck = new Queue();

         // creating an object of GreekHeroArray class.
         GreekHeroArray obj1 = new GreekHeroArray();

         // calling getCards method of greekHeroArray CLASS
         // and
         // giving it to an array of GreekHero class....
         GreekHero[] cards = obj1.getCards();

         // calling the suffle method to suffle the cards.
         shuffle( cards );

         for ( int i = 0; i < cards.length; i++ ) {
            // insert method inserts all the suffled cards
            // in a queue.
            deck.insert( cards[i] );

         }

         // creating two more queue object for hands
         Queue playerHand = new Queue();
         Queue computer = new Queue();
         Queue center = new Queue();

         // distributing 15 cards for each of the player.
         for ( int i = 0; i < 15; i++ ) {
            playerHand.insert( cards[i] );

         }
         for ( int i = 15; i < 30; i++ ) {
            computer.insert( cards[i] );
         }

         do {
            do {
               System.out.println();
               if ( equal == 2 ) {
                  center.insert( playerC );
                  center.insert( computerC );
                  size = size + 2;
               }
               if ( !turn ) {
                  System.out.println( "Press ENTER to start your turn....." );
                  keyboard.nextLine();
                  keyboard.nextLine();
                  System.out.println(
                        "Good Luck with the  intellegent choice of Options..." );
                  System.out.println( "Cards on your hand..." );
                  System.out.println();
                  System.out.println( playerHand );
               }
               playerCard = playerHand.delect();
               computerCard = computer.delect();
               if ( playerCard instanceof GreekHero
                     && computerCard instanceof GreekHero ) {
                  playerC = (GreekHero) playerCard;
                  computerC = (GreekHero) computerCard;
               }
               if ( !turn ) {
                  System.out.println( "ENTER 1 for bravery" );
                  System.out.println( "ENTER 2 for wisdom" );
                  System.out.println( "ENTER 3 for strength" );
                  System.out.println( "ENTER 4 for ferocity" );
                  System.out.println( "ENTER 5 for fearFactor" );
                  System.out.println();
                  System.out.println(
                        "Select any properties from above that you would like to compare with." );
                  properties = keyboard.nextInt();
                  // turn = true;

               }
               else {
                  System.out.println();
                  System.out.println( "It's  computer's turn...." );
                  properties = randomNumber.nextInt( 5 ) - 1;
                  System.out.println();
                  // turn = false;
               }

               System.out.println();

               if ( properties == 1 ) {
                  comCompare = computerC.getBravery();
                  playerCompare = playerC.getBravery();
                  System.out.println( "Computer bravery is " + comCompare );
                  System.out.println( "Player bravery is " + playerCompare );
               }
               else if ( properties == 2 ) {
                  comCompare = computerC.getWisdom();
                  playerCompare = playerC.getWisdom();
                  System.out.println( "Computer wisdom is " + comCompare );
                  System.out.println( "Player wisdom is " + playerCompare );
               }
               else if ( properties == 3 ) {
                  comCompare = computerC.getStrength();
                  playerCompare = playerC.getStrength();
                  System.out.println( "Computer strength is " + comCompare );
                  System.out.println( "Player strength is " + playerCompare );
               }
               else if ( properties == 4 ) {
                  comCompare = computerC.getFerocity();
                  playerCompare = playerC.getFerocity();
                  System.out.println( "Computer ferocity is " + comCompare );
                  System.out.println( "Player ferocity is " + playerCompare );
               }
               else {
                  comCompare = computerC.getFearFactor();
                  playerCompare = playerC.getFearFactor();
                  System.out.println( "Computer FearFactor is " + comCompare );
                  System.out.println( "Player FearFactor is " + playerCompare );
               }

               if ( playerCompare > comCompare ) {
                  computerNumber = ifPlayerWon( computerNumber, equal, size );

                  InsertOn( playerCompare, comCompare, playerHand, computer,
                        computerC, playerC, equal, center, size );
                  if ( equal == 2 ) {
                     playerNumber = playerNumber + ((size / 2) + 1);
                     System.out.println( "Player have " + playerNumber
                           + " cards in the hand. " );
                  }
                  else {
                     playerNumber++;
                     System.out.println( "Player have " + playerNumber
                           + " cards in the hand. " );
                  }

                  turn = false;
                  equal = 1;

               }
               else if ( comCompare > playerCompare ) {
                  playerNumber = ifComputerWon( playerNumber, equal, size );

                  InsertOn( playerCompare, comCompare, playerHand, computer,
                        computerC, playerC, equal, center, size );
                  if ( equal == 2 ) {
                     computerNumber = computerNumber + ((size / 2) + 1);
                     System.out.println( "Computer have " + computerNumber
                           + " cards in the hand. " );

                  }
                  else {
                     computerNumber++;
                     System.out.println( "Computer have " + computerNumber
                           + " cards in the hand. " );

                  }
                  turn = true;
                  equal = 1;
               }

               else {
                  System.out.println(
                        "Both cards is at center. So, continue with dealting different card " );
                  equal = 2;

               }

               System.out.println();
               System.out.println( "Exist(YES) or Keep Playing(NO) ?" );
               System.out
                     .println( "ENTER 'Y' for \"YES\" and 'N' for \"NO\":" );
               quit = keyboard.next().toLowerCase().charAt( 0 );

            } while ( equal == 2 );

            size = 0;

         } while ( (playerNumber != 0 && computerNumber != 0) && quit != 'y' );
         System.out.println();
         System.out.println( "********* GAME OVER *********" );
         System.out.println();
         System.out.println( "Displaying remaining card on Player's hand..." );
         System.out.println();
         System.out.println( playerHand );
         System.out.println();
         boolean flag = playerHand.isEmpty();
         if ( playerNumber < computerNumber ) {
            System.out.println( "*******Computer won the game********" );
         }
         else if ( playerNumber == computerNumber ) {
            System.out.println( "******* Game is DRAW ********" );
         }
         else
            System.out.println( "*******Player won the game********" );

      }

      else if ( choose == 3 ) {
         System.out.println( "Programming is now terminating....." );

      }
      
      }while(choose != 3 );

   }

   /**
    * This method will take nine items as a parameter. It
    * checkss in player
    * properties is greater or customer proprties and do the
    * necessary insertion on
    * respective hands. The method will not return any
    * value.
    */

   public static void InsertOn(int playerCompare , int comCompare ,
         Queue playerHand , Queue computer , GreekHero computerC ,
         GreekHero playerC , int equal , Queue center , int size) {
      Object delect = null;
      if ( playerCompare > comCompare ) {
         if ( equal == 2 ) {
            playerHand.insert( playerC );
            playerHand.insert( computerC );
            for ( int i = 0; i < size; i++ ) {
               delect = center.delect();
               playerHand.insert( delect );
            }
         }
         else {
            playerHand.insert( playerC );
            playerHand.insert( computerC );
         }
      }

      else if ( comCompare > playerCompare ) {
         if ( equal == 2 ) {
            computer.insert( computerC );
            computer.insert( playerC );

            for ( int i = 0; i < size; i++ ) {
               delect = center.delect();
               computer.insert( delect );
            }
         }
         else {
            computer.insert( playerC );
            computer.insert( computerC );
         }

      }

   }

   /**
    * The method shuffle doesnot take any parameter and
    * doesnot return any thing.
    * It shuffle the deck of cards.
    */

   public static void shuffle(GreekHero[] cards) {
      Random random = new Random();
      for ( int next = 0; next < cards.length; next++ ) {
         int r = random.nextInt( cards.length );
         GreekHero temp = cards[next];
         cards[next] = cards[r];
         cards[r] = temp;
      }
   }

   /**
    * This method doesnot take any parameter and returns an
    * integer. It will
    * provide option for the user to select which option
    * they would like to
    * manipulate.
    * 
    */

   public static int getOption() {
      int dequeOption;
      System.out.println( "Which one do you like to manipulate ?" );
      System.out.println( "Enter 1: for deque " );
      System.out.println( "Enter 2: for queue" );
      System.out.println( "Enter 3: for stack" );
      dequeOption = keyboard.nextInt();
      return dequeOption;

   }

   /**
    * The method ifPlayerWon will take three items as a
    * parameter and return an
    * integer. This method will do the deduction on computer
    * number of cards in
    * computer's hand and return the number.
    */
   public static int ifPlayerWon(int computerN , int equal , int size) {

      System.out.println( "Player won the game..." );
      if ( equal == 2 ) {
         computerN = computerN - ((size / 2) + 1);
         System.out.println(
               "Computer have " + computerN + " cards in the hand. " );

      }
      else {
         computerN--;
         System.out.println(
               "Computer have " + computerN + " cards in the hand. " );
      }

      return computerN;

   }

   /**
    * The method ifComputerWon will take three items as a
    * parameter and return an
    * integer. This method will do the deduction on player
    * number of cards in
    * player's hand and return the number.
    */

   public static int ifComputerWon(int playerN , int equal , int size) {

      System.out.println( "Computer won the game..." );
      if ( equal == 2 ) {
         playerN = playerN - ((size / 2) + 1);
         System.out
               .println( "Player have " + playerN + " cards in the hand. " );
      }
      else {
         playerN--;
         System.out
               .println( "Player have " + playerN + " cards in the hand. " );
      }
      return playerN;

   }

}

/**
 * This is the qeue class. The class is the primary class
 * for all other classes.
 * It have an option to insert from front, back , delect
 * from front and back, is
 * empty , to string and to store. We have two integer
 * varaibles front and back
 * that keeps track of front and back of deque. It is
 * applied with the Object
 * data member.
 */
class Deque {

   private Object[]         deque;

   private int              front; // to hold front of
                                   // deeque

   private int              rear; // to hold back of deque

   private int              size; // to hold the number of
                                  // items

   private static final int ALLOCATE = 50;

   public Deque() {

      deque = new Object[ALLOCATE];
      front = 0;
      rear = 1;
      size = 0;

   }

   /**
    * This method will not take anything as a parameter, it
    * will return a boolean
    * value. It will check weather the deque is empty or
    * not. If it is empty it
    * will return true otherwise it returns false.
    */

   public boolean isEmpty() {

      return (size == 0);

   }

   /**
    * This method doesnot take anything as a parameter and
    * doesnot return anything
    * ethier. The method create another array twice the size
    * of the previous one
    * once it is full and make the old deque as the update
    * one.
    */

   private void updateArray() {
      Object[] updateArray2 = new Object[size * 2];
      int oldIndx = front + 1;
      for ( int i = 0; i < size; i++ ) {

         if ( oldIndx == deque.length ) {
            oldIndx = 0;

         }

         updateArray2[i] = deque[oldIndx];

         ++oldIndx;

      }
      deque = updateArray2;
      front = deque.length - 1;
      rear = size;

   }

   /**
    * This method will take an object as a parameter and
    * doesnot return anthing.
    * This method will insert an object in a deque from the
    * front.
    */

   public void insertOnFront(Object s1) {

      if ( size == deque.length ) {
         updateArray();

      }
      deque[front] = s1;

      front--;
      if ( front == -1 ) {

         front = deque.length - 1;

      }

      size++;

   }

   /**
    * This method will take an object as a parameter and
    * doesnot return anthing.
    * This method will insert an object in a deque from the
    * back.
    */

   public void insertOnBack(Object s2) {

      if ( size == deque.length ) {
         updateArray();

      }
      deque[rear] = s2;
      rear++;
      if ( rear == deque.length ) {

         rear = 0;
      }

      size++;

   }

   /**
    * This method doessnot take anything as a parameter and
    * returns an object. This
    * method will delect an object from the front of the
    * deque and return that.
    */

   public Object delectFromFront() {
      boolean empty = isEmpty();
      Object result;
      if ( empty ) {
         return null;
      }
      front++;
      if ( front == deque.length )
         front = 0;
      result = deque[front];
      deque[front] = null;
      size--;

      return result;
   }

   /**
    * This method doessnot take anything as a parameter and
    * returns an object. This
    * method will delect an object from the back of the
    * deque and return that.
    */

   public Object delectFromBack() {
      boolean empty = isEmpty();

      Object result;
      if ( empty ) {
         return null;
      }
      rear--;
      if ( rear == -1 )
         rear = deque.length - 1;
      result = deque[rear];
      deque[rear] = null;
      size--;

      return result;
   }

   /**
    * This method doesnot take anything as a parameter and
    * returns an string
    * summarizing an entire elements of the deque.
    */
   public String toString() {

      String result = "";

      if ( isEmpty() )
         return result;
      int ix = front + 1;
      for ( int i = 0; i < size; i++ ) {

         if ( ix == deque.length )
            ix = 0;
         result += deque[ix] + " \n";
         ix++;
      }

      return result;

   }

   /**
    * This method doesnot take anything as a parameter but
    * returns an string
    * summarizing the entire deque.
    */

   public String toStore() {
      String result = "";

      for ( int i = 0; i < deque.length; i++ ) {

         result = result + deque[i] + " ";

      }
      return result // + "front = "+ deque[front-2]
                    // + "rear = "+ deque[rear-1]
            + "\n" + "size  = " + size + "\n";

   }

}

/**
 * The stack is where we can add and remove an item from top
 * of the stack. This
 * class uses the deque object to perform it's method.
 */

class Stack {

   private Deque stack;

   public Stack() {
      stack = new Deque();
   }

   /**
    * This method will take an object as a parameter and
    * doesnot return anthing.
    * This method will insert an object in a stack from the
    * front.
    */

   public void push(Object obj1) {

      stack.insertOnFront( obj1 );
   }

   /**
    * This method doessnot take anything as a parameter and
    * returns an object. This
    * method will delect an object from the front of the
    * stack and return that.
    */
   public Object pop() {

      Object item;
      item = stack.delectFromFront();

      return item;
   }

   /**
    * This method will not take anything as a parameter, it
    * will return a boolean
    * value. It will check weather the deque is empty or
    * not. If it is empty it
    * will return true otherwise it returns false.
    */

   public boolean isEmpty() {

      return stack.isEmpty();
   }

   /**
    * This method doesnot take anything as a parameter and
    * returns an string
    * summarizing an entire elements of the stack.
    */
   public String toString() {

      return stack.toString();
   }
}

class Queue {

   private Deque queue;

   public Queue() {

      queue = new Deque();

   }

   /**
    * This method will take an object as a parameter and
    * doesnot return anthing.
    * This method will insert an object in a queue from the
    * back.
    */

   public void insert(Object obj1) {
      queue.insertOnBack( obj1 );

   }

   /**
    * This method doessnot take anything as a parameter and
    * returns an object. This
    * method will delect an object from the front of the
    * queue and return that.
    */

   public Object delect() {

      return queue.delectFromFront();

   }

   /**
    * This method will not take anything as a parameter, it
    * will return a boolean
    * value. It will check weather the deque is empty or
    * not. If it is empty it
    * will return true otherwise it returns false.
    */

   public boolean isEmpty() {

      return queue.isEmpty();
   }

   /**
    * This method doesnot take anything as a parameter and
    * returns an string
    * summarizing an entire elements of the queue.
    */
   public String toString() {

      return queue.toString();
   }

}

/**
 * This class is created to manipulate the deque in main
 * application. This will
 * only have name and id of the customer.
 */
class Customer {

   private String _name; // to hold the name

   private int    _id; // to hold an id

   public Customer(String name, int id) {
      _name = name;
      _id = id;

   }

   /**
    * method returns name of the customer.
    */

   public String getName() {
      return _name;
   }

   /**
    * method returns an id of the customer.
    */
   public int getID() {

      return _id;

   }

   /**
    * method returns string i.e name and id.
    */

   public String toString() {

      return "Name = " + _name + "\t=>" + "Id = " + _id + "\n";

   }
}

class GreekHero {

   private String _name;

   private int    _bravery;

   private int    _wisdom;

   private int    _strength;

   private int    _ferocity;

   private int    _fearFactor;

   /**
    * Constructor with parameters
    */
   public GreekHero(String name, int bravery, int wisdom, int strength,
         int ferocity, int fearFactor) {
      _name = name;
      _bravery = bravery;
      _wisdom = wisdom;
      _strength = strength;
      _ferocity = ferocity;
      _fearFactor = fearFactor;
   }

   /**
    * Accessor method for name
    *
    * @return _name
    */
   public String getName() {
      return _name;
   }

   /**
    * Accessor method for bravery
    *
    * @return _bravery
    */
   public int getBravery() {
      return _bravery;
   }

   /**
    * Accessor method for wisdom
    *
    * @return _wisdom
    */
   public int getWisdom() {
      return _wisdom;
   }

   /**
    * Accessor method for strength
    *
    * @return _strength
    */
   public int getStrength() {
      return _strength;
   }

   /**
    * Accessor method for ferocity
    *
    * @return _ferocity
    */
   public int getFerocity() {
      return _ferocity;
   }

   /**
    * Accessor method for fear facto0r
    *
    * @return _fearFactor
    */
   public int getFearFactor() {
      return _fearFactor;
   }

   /**
    * toString method
    *
    * @return string representation of a GreekHero
    */
   public String toString() {
      return "[" + _name + "]\n" + "(a)Bravery:" + _bravery + ", (b)Wisdom:"
            + _wisdom + ", (c)Strength:" + _strength + ", (d)Ferocity:"
            + _ferocity + ", (e)Fear Factor:" + _fearFactor;
   }
} // end class GreekHero()

class GreekHeroArray {

   private GreekHero[] cards;

   /**
    * Default constructor for the array of GreekHero cards
    */
   public GreekHeroArray() {
      cards = new GreekHero[] {
            // bravery, wisdom, strength, ferocity, fear
            // factor

            new GreekHero( "Achilles", 20, 48, 78, 14, 12 ),
            new GreekHero( "Medusa", 5, 30, 60, 12, 50 ),
            new GreekHero( "Chimera", 5, 10, 140, 20, 48 ),

            new GreekHero( "Polyphemus", 8, 18, 140, 15, 47 ),
            new GreekHero( "Cetus", 5, 14, 150, 16, 45 ),
            new GreekHero( "Zeus", 10, 100, 200, 8, 40 ),

            new GreekHero( "Minotaur", 12, 25, 138, 18, 40 ),
            new GreekHero( "Craeae", 6, 99, 30, 1, 40 ),
            new GreekHero( "Pegasus", 20, 20, 180, 9, 37 ),

            new GreekHero( "Siren", 3, 30, 160, 7, 36 ),
            new GreekHero( "Daphne", 10, 21, 47, 2, 30 ),
            new GreekHero( "Poseidon", 20, 90, 150, 15, 30 ),

            new GreekHero( "Theseus", 26, 38, 75, 10, 12 ),
            new GreekHero( "Odysseus", 30, 56, 65, 10, 11 ),
            new GreekHero( "Perseus", 26, 40, 70, 9, 10 ),

            new GreekHero( "Icarus", 18, 65, 50, 2, 9 ),
            new GreekHero( "Jason", 27, 39, 68, 8, 9 ),
            new GreekHero( "Oedipus", 26, 74, 63, 1, 7 ),

            new GreekHero( "Pandora", 10, 50, 32, 1, 5 ),
            new GreekHero( "Orpheus", 30, 51, 41, 4, 5 ),
            new GreekHero( "Sisyphus", 9, 80, 40, 3, 5 ),

            new GreekHero( "Ariadne", 29, 45, 40, 2, 3 ),
            new GreekHero( "Narcissus", 3, 50, 50, 8, 2 ),
            new GreekHero( "Aphrodite", 9, 49, 40, 6, 2 ),

            new GreekHero( "Trojan Horse", 0, 0, 185, 18, 29 ),
            new GreekHero( "Hermes", 18, 84, 100, 6, 29 ),
            new GreekHero( "Athene", 19, 85, 110, 5, 25 ),

            new GreekHero( "Prometheus", 22, 70, 37, 3, 24 ),
            new GreekHero( "Actaeon", 23, 20, 80, 3, 22 ),
            new GreekHero( "Heracles", 15, 55, 170, 13, 22 )

      };
   }

   /**
    * Accessor method to the array of GreekHero cards
    *
    * @return array of GreekHero cards created
    */
   public GreekHero[] getCards() {
      return cards;
   }

} // end class GreekHeroArray()
