int fall = 0;
int randomNumber = (int) random(500);
void setup() {
  size(500,500);
  
}

void draw() {
  background(0, 225,0);
  fill(0,0,255);
  stroke(0,0,255);
  ellipse(randomNumber,fall, 50,50);
  fall +=5;
  if (fall == 500) {
    fall = fall - 500;
    randomNumber = (int) random(500);
  }
}
