#include "stdafx.h"
#include <GL/glut.h>  // incluye GLUT,  glu.h y gl.h

void display() {
	glLoadIdentity();
	glClear(GL_COLOR_BUFFER_BIT); 


	glColor3f(0,0,0);
	glBegin(GL_LINES);
		//linea horizontal
		glVertex2i(-4,0);
		glVertex2i(4,0);

		//linea vertical
		glVertex2i(0,4);
		glVertex2i(0,-4);

		glLineWidth(2.0);
		//marcas de linea X
		glVertex2f(-4,0.25);
		glVertex2f(-4,-0.25);
		glVertex2f(-3,0.25);
		glVertex2f(-3,-0.25);
		glVertex2f(-2,0.25);
		glVertex2f(-2,-0.25);
		glVertex2f(-1,0.25);
		glVertex2f(-1,-0.25);
		glVertex2f(1,0.25);
		glVertex2f(1,-0.25);
		glVertex2f(2,0.25);
		glVertex2f(2,-0.25);
		glVertex2f(3,0.25);
		glVertex2f(3,-0.25);
		glVertex2f(4,0.25);
		glVertex2f(4,-0.25);

		//lineas intermedias en X
		glColor3f(1,0,0);
		glLineWidth(1.0);
		for (double i=-3.5; i<4; i++)
		{
			glVertex2f(i,0.10);
			glVertex2f(i,-0.10);
		}


		//lineas eje Y
		glColor3f(0,0,0);
		glLineWidth(2.0);
		for (double i=-4; i<4; i++)
		{
			glVertex2f(0.25,i);
			glVertex2f(-0.25,i);
		}


		//lineas intermedias en Y
		glColor3f(1,0,0);
		glLineWidth(1.0);
		for (double i=-3.5; i<4; i++)
		{
			glVertex2f(0.10, i);
			glVertex2f(-0.10, i);
		}
	glEnd();

  

  
	glutSwapBuffers();
	 glFlush();
  
  }

void init() {
	glutDisplayFunc(display);
	glutPostRedisplay();
	glClearColor(0.22f, 0.69f, 0.79f,0);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(-4,4, -4, 4, -1, 1);
	glMatrixMode(GL_MODELVIEW);
}

int main(int argc, char** argv) {
    glutInit(&argc, argv); 
    glutInitDisplayMode(GLUT_DOUBLE);
    glutInitWindowSize(700,500);
    glutInitWindowPosition(100,100);  
    glutCreateWindow("Primera Ventana"); 
    init();
    glutDisplayFunc(display); 
    glutMainLoop(); 
    return 0;
}    

