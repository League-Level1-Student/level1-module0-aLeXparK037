PImage record;
int rotateAmount = 0;

  import ddf.minim.*;             //at the very top of your sketch
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
void setup() {
  size(600,600);
  record = loadImage("oldRecord.png");
  record.resize(600,600);
  image(record, 0,0);

  minim = new Minim(this);    
  song = minim.loadFile("awesomeTrack.mp3", 512);   
}

void draw() {
  
if (mousePressed) {
    rotateImage(record, rotateAmount);
   image(record, 0,0);
   if (!song.isPlaying()) {
     song.play();
   }
   
    rotateAmount += 10;
} 
else {
  if (song.isPlaying()) {
    song.pause();
  }
 
}
  

}
void rotateImage(PImage image , int a) {
  translate(width/2, height/2);
  rotate(a*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
