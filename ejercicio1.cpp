#include "stdafx.h"
#include <GL/glut.h>  // incluye GLUT,  glu.h y gl.h

void display() {
	glLoadIdentity();
	glClear(GL_COLOR_BUFFER_BIT); 



	glBegin(GL_TRIANGLES);
		glColor3f(0, 1.00f, 0.0f);
		glVertex2f(-1, 1);
		glColor3f(1, 0.00f, 0.0f);
		glVertex2f( 3, 3);
		glColor3f(0, 0.00f, 1.0f);
		glVertex2f( 4, 1);
		

		
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
	glOrtho(-4, 4, -1, 4, -1, 1);
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