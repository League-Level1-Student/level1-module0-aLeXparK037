int fall = 0;
int randomNumber = (int) random(500);
int score = 0;
void setup() {
  size(500,500);
  
}
void fall() {
  fill(255,0,0);
  rect(mouseX-25,400, 100,100);
  fill(0,0,255);
  stroke(0,0,255);
  ellipse(randomNumber,fall, 50,50);
}
void spawn() {
  if (fall == 500) {
    fall = fall - 500;
    randomNumber = (int) random(500);
  }
  if (randomNumber > mouseX &&randomNumber < mouseX+100 &&fall == 495) {
    score +=1;
  } else if (randomNumber < mouseX &&randomNumber > mouseX+100 &&fall == 495) {
    score  -=1;
    if (score == 0) {
      score = 0;
    }
  }
}
void scores(){
  fill(0,0,0);
  textSize(16);
  text("score: " + score, 20,20);
}
void draw() {
 
  background(0, 225,0);
  
  fall();
  fall +=5;
  spawn();
  scores();
  if (score > 10) {
    fall();
    fall +=10;
    spawn();
    scores();
  } else if (score > 20) {
    fall();
    fall +=20;
    spawn();
    scores();
  }
 
  
  
}
