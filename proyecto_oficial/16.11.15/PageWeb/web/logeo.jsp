<%-- 
    Document   : logeo
    Created on : 19/11/2015, 12:18:51 PM
    Author     : Parisan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
    <meta charset="es">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="css/estilo1.css">
    <link rel="stylesheet" href="boostrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="engine1/style.css"/>
    <script type="text/javascript" src="engine1/jquery.js"></script>

</head >

<div class="container">
    <div class="fondo">
        <div class="row">          

            <div class="col-md-12">
                <div class="texto1">
                    <p>Bienvenidos "NetMaster"</p>
                </div>
                <div class="texto2">
                    
                </div>
            </div>

        </div>
        <br>
    </div>        
</div>
<body>
    <jsp:useBean id="mensaje" scope="request" class="java.lang.String" />
<article>
    <div class="container">
        <div class="container alert-success" id="login">
            <div class="row">
                <div class="col-md-12">
                    <h1 class=" form-signin-heading"><center><strong class="inicio">Inicio</strong></center></h1>
                    <br>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <form action="control" method="post">
                        <div class="form-group">
                            <%/*<div class="input-group">
                             <%/*<span class="input-group-addon">@</span>*/%>
                            <input type="usuario" class="form-control" placeholder="Usuario" name="usuario" required autofocus>
                            <%/*</div>*/%>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="Contrase&ntilde;a" name="password" required>
                        </div>
                        <button class="btn btn-lg btn-primary btn-block" type="submit">
                            <strong>Iniciar seci&oacute;n</strong>
                        </button>
                            ${mensaje}
                    </form>
                </div>
            </div>  
        </div>


    </div>


</article>  
<aside class="slider">
    <div id="wowslider-container1">
        <div class="ws_images"><ul>
                <li><img src="img/1" alt="" title="" id="wows1_0"/></li>
                <li><img src="img/2" alt="" title="" id="wows1_1"/></li>
                <li><img src="img/3" alt="" title="" id="wows1_2"/></li>
                <li><img src="img/4" alt="" title="" id="wows1_3"/></li>
                <li><img src="img/5" alt="" title="" id="wows1_4"/></li>
                <li><a href="http://wowslider.com/vf"><img src="img/1" alt="full screen slider" title="" id="wows1_11"/></a></li>
            </ul></div>
        <div class="ws_bullets"><div>
                <a href="#" title=""><img src="img/1"alt=""/>1</a>
                <a href="#" title=""><img src="img/2" alt=""/>2</a>
                <a href="#" title=""><img src="img/3" alt=""/>3</a>
                <a href="#" title=""><img src="img/4" alt=""/>4</a>
                <a href="#" title=""><img src="img/5" alt=""/>5</a>
            </div></div><span class="wsl"><a href="http://wowslider.com">slideshow</a> by WOWSlider.com v6.4</span>
        <div class="ws_shadow"></div>
    </div>	
    <script type="text/javascript" src="engine1/wowslider.js"></script>
    <script type="text/javascript" src="engine1/script.js"></script>
    <!-- End WOWSlider.com BODY section -->
</aside>


<!-- Latest compiled and minified JavaScript -->
<script src="jquery/jquery-1.11.2.min.js"></script>
<script src="boostrap/js/bootstrap.js"></script>
</body>
</html>
