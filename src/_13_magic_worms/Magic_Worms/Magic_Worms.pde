int x = 0;
int y = 0;

void setup() {
size(300,300);
  background(#000000);


}

void draw() {
  makeMagical();
 for (int i = 0; i < 300; i++) {
  fill(255,0,0);
   //int randomNumber = (int) random(300);
   //int randomNumbers = (int) random(300);
   ellipse(getWormX(i),getWormY(i), 5,5);
 }
}

float frequency = .009;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
