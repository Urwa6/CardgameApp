
                                                                              Card Game App 

A simple **memory card matching game** for Android built with **Kotlin**, **ViewPager2**, and **Fragments**.

Features
  
  Three-screen flow using ViewPager2:
  1. **Start Screen** – displays the game title and "Start Game" button  
  2. **Game Screen** – grid of cards with flip & match logic  
  3. **Win Screen** – shows a "You Win!" message and "Play Again" button
- **Adaptive card sizing** – cards scale based on screen width  
- **Dynamic matching logic** – supports any number of pairs  
- Clean, modular code using Fragments and Kotlin best practices

 Tech Stack

- **Language:** Kotlin  
- **Architecture:** Fragments + ViewPager2  
- **IDE:** Android Studio  
- **Minimum SDK:** 21  
- **Resources:** PNG card images in `res/drawable`

Project Structure

app/
├─ src/main/java/com/example/cardgame/
│ ├─ MainActivity.kt
│ ├─ GamePagerAdapter.kt
│ ├─ StartFragment.kt
│ ├─ GameFragment.kt
│ └─ WinFragment.kt
├─ src/main/res/layout/
│ ├─ activity_main.xml
│ ├─ fragment_start.xml
│ ├─ fragment_game.xml
│ └─ fragment_win.xml
└─ src/main/res/drawable/
├─ card_back.png
├─ ic_card1.png
├─ ic_card2.png
└─ ic_card3.png

How to Play

Tap Start Game

Flip cards to find matching pairs

When all pairs are matched, the Win screen appears

Tap Play Again to restart




