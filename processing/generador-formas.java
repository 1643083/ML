//declaraciones globales

//se ejecuta primero pero una sola vez
void setup(){
  size(64,64);
}

//se ejecuta en un loop
void draw(){
  
  //iterar para 3 figuras geométricas
  for(int i = 0; i < 3; i++){
    //configuración
    background(255); //color de fondo
    pushMatrix(); //traslación de objetos
    strokeWeight(4); //borde
    
    //generaremos círculos en diferentes tamaños y lugares
    //con la condición de que no se rendericen fuera del lienzo
    float r = random(8,24); //radio
    float x = random(r, width - r); //eje x
    float y = random(r, height - r); //eje y
  
    //color de borde
    stroke(random(100), random(100), random(100));
    
    //mover el plano
    translate(x, y);
    
    //condición 0 = circulos
    if (i == 0){
      circle(0, 0, (r*2));
      saveFrame("data/circle###.png");
    }
    
    popMatrix();
  }
  
  if (frameCount == 100){
  exit();
  }
}