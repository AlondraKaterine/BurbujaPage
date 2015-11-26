<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title></title>
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="estilos/menu.css">
</head>
<body>
   <header class="navbar navbar-static-top bs-docs-nav" id="top" role="banner">
  <div class="container">
    <div class="navbar-header">
      <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#bs-navbar" aria-controls="bs-navbar" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
    </div>
   
  </div>
  <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navegacion-fm">
            <span class="sr-only">Desplegar / Ocultar Menu</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a href="#" class="navbar-brand"><font face="Lucida Calligraphy">Multiservicios El Burbujita</font></a>
        </div>
        <!-- Inicia Menu -->
        <div class="collapse navbar-collapse" id="navegacion-fm">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.html" class="glyphicon glyphicon-home">Inicio</a></li>
           
            <li><a href="ventas.html" class="glyphicon glyphicon-usd">Ventas</a></li>
            <li><a href="compras.html" class="glyphicon glyphicon-shopping-cart">Compra</a></li>
            <li><a href="catalogo.html" class="glyphicon glyphicon-picture">Catalogo</a></li>
             <li class="dropdown">
              <a href="#"  class="glyphicon glyphicon-calendar" class="dropdown-toggle" data-toggle="dropdown" role="button">
                Reportes <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="reporte_ventas.html">Reporte de Ventas</a></li>
                <li><a href="#">Reporte de Compras</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#"  class="glyphicon glyphicon-list" class="dropdown-toggle" data-toggle="dropdown" role="button">Acerca de <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
              <li><a href="historia.html"> Nosotros</a></li>
              </ul>
            </li>
            <li><a href="listado.html" class="glyphicon glyphicon-phone-alt">Contacto</a></li>
          </ul>

          <form action="" class="navbar-form navbar-right" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="buscar">
            </div>
            <button type="submit" class="btn btn-primary">
              <span class="glyphicon glyphicon-search"></span>
            </button>
          </form>
        </div>
      </div>
    </nav>
  </header>
</header>
  <h2>
  <p></p>

  </h2>
  <div><a href="colaboradora.html" class="">
        <span class="" aria-hidden="true"></span>
        </a></div>
  
  <script tipe= "text/javascript" src="jquery/jquery-2.1.4.min.js"></script> 
  <script tipe= "text/javascript" src="bootstrap/js/bootstrap.min.js"></script> 
</header>
<div class="container">
  <h2>Reporte de mis ventas</h2>
              
  <table class="table table-bordered class-hover">
    
      <tr>
        <th>Numero_vendedor</th>
        <th>Nombre</th>
        <th>cod_articulo</th>
        <th>Nombre_articulo</th>
        <th>Cantidad </th>
        <th>costo </th>
        <th>Mes</th>
        
      </tr>

      <tr>
        <td>100</td>
        <td>Lady Yessi</td>
        <td>10</td>
        <td>lapicero pilot</td>
        <td>10</td>
        <td>$25</td>
        <td>septiembre</td>
        
      </tr>
      </tr>

      <tr>
        <td>100</td>
        <td>Lady Yessi</td>
        <td>15</td>
        <td>mouse</td>
        <td>5</td>
        <td>$125</td>
        <td>septiembre</td>
        
      </tr>
      </tr>
      <tr>
        <td>200</td>
        <td>Cinthia Ramos</td>
        <td>18</td>
        <td>parlantes</td>
        <td>2</td>
        <td>$60</td>
        <td>agosto</td>
        
      </tr>
      </tr>

      <tr>
        <td>200</td>
        <td>Cinthia Ramos</td>
        <td>12</td>
        <td>fotocopias colores</td>
        <td>40</td>
        <td>$12</td>
        <td>agosto</td>
        
      </tr>
      </tr>
      <tr>
        <td>300</td>
        <td>tarapoto</td>
        <td>09</td>
        <td>anillado 100hj</td>
        <td>5</d>
        <td>$15</td>
        <td>septiembre</td>
        
      </tr>
      </tr>
      
      
    </table>
</div>

</body>
</html>