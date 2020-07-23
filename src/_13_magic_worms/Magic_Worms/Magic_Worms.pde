int x = 0;
int y = 0;

void setup() {
size(300,300);
background(#000000);
for (int i = 0; i < 300; i++) {
   int randomNumber = (int) random(300);
   int randomNumbers = (int) random(300);
   ellipse(randomNumber,randomNumbers, 50,50);
 }
}

void draw() {
 
}

float frequency = .001;
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
