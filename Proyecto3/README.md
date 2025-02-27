# Proyecto de Animación con CSS

## Descripción del Proyecto

Este proyecto consiste en una página web con efectos de animación utilizando únicamente CSS. El propósito es crear una interfaz visualmente atractiva con cambios de color dinámicos y efectos de opacidad al interactuar con el contenido.

## Tecnologías Utilizadas

HTML5 para la estructura del contenido.

CSS3 para la animación y estilos.

## Funcionalidades

Fondo con animación de colores cíclica mediante @keyframes.

Efecto hover para revelar texto oculto.

Texto con opacidad para un efecto de aparición sutil.

Diseño responsive con tipografías modernas.

Estructura de la Animación

La animación del fondo cambia de color en seis fases con una duración total de 6 segundos, repitiéndose infinitamente.

Al pasar el mouse sobre un bloque de contenido, el texto oculto se vuelve visible.

## Código de Ejemplo

body{
    background-color: crimson;
    text-align: center;
    font-family: 'Gill Sans', sans-serif;
    animation-name: fondo;   
    animation-duration: 6s;
    animation-iteration-count: infinite;
}

@keyframes fondo {
    16.6% {background-color: crimson;}
    33.2% {background-color: lightblue;}
    49.8% {background-color: orange;}
    66.4% {background-color: turquoise;}
    83% {background-color: teal;}
    100% {background-color: yellowgreen;}
}

## Ignore
body{
    background-color: crimson;
    text-align: center;
    font-family: 'Gill Sans', sans-serif; 
    animation-name: fondo;   
    animation-duration: 6s;
    animation-iteration-count: infinite;
}
Hemos añadido un Ignore para que la base de la pagina no pueda ser modificada

## Mejoras Futuras

Añadir efectos de transición para el texto.

Incorporar elementos interactivos adicionales.

Implementar versiones accesibles para diferentes tamaños de pantalla.

## Licencia
- Este proyecto está bajo la licencia MIT.

## Autores
Alonso Scalone 
Pablo Caballero

## Contacto

📧 Email: [email@1ºDAM.com] 
🌍 Web: [www.Proyecto3.com]
