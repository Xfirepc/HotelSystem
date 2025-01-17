<%@page import="java.sql.ResultSet"%>
<%@page import="Model.User"%>
<%
    ResultSet user = null;
    HttpSession getSession = (HttpSession) request.getSession();
    if(getSession.getAttribute("user") == null){
    %>
        <script>window.location = "index.jsp"</script>
    <%
    }else{
        user = (ResultSet) getSession.getAttribute("user");
    }
%>
<body class="fix-header">
 
    <!-- ============================================================== -->
    <!-- Wrapper -->
    <!-- ============================================================== -->
    <div id="wrapper">
        <!-- ============================================================== -->
        <!-- Topbar header - style you can find in pages.scss -->
        <!-- ============================================================== -->
        <nav class="navbar navbar-default navbar-static-top m-b-0">
            <div class="navbar-header">
                <div class="top-left-part">
                    <!-- Logo -->
                    <a class="logo" href="habitaciones.jsp">
                        <!-- Logo icon image, you can use font-icon also --><b>
                            <!--This is dark logo icon--><img src="assets/admin/images/admin-logo.png" alt="home"
                                class="dark-logo" />
                            <!--This is light logo icon--><img src="assets/admin/images/admin-logo-dark.png" alt="home"
                                class="light-logo" />
                        </b>
                        </span> </a>
                </div>
                <!-- /Logo -->
                <ul class="nav navbar-top-links navbar-right pull-right">
                    <li>
                        <a class="nav-toggler open-close waves-effect waves-light hidden-md hidden-lg"
                            href="javascript:void(0)"><i class="fa fa-bars"></i></a>
                    </li>
                    <li>
                        <a class="profile-pic" href="#"> <img src="https://www.shareicon.net/data/2016/09/01/822711_user_512x512.png" alt="user-img"
                                width="36" class="img-circle"><b class="hidden-xs">Hola, <%=user != null ? user.getString("name"): ""%></b></a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-header -->
            <!-- /.navbar-top-links -->
            <!-- /.navbar-static-side -->
        </nav>
        <!-- End Top Navigation -->
        <!-- ============================================================== -->
        <!-- Left Sidebar - style you can find in sidebar.scss  -->
        <!-- ============================================================== -->
        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav slimscrollsidebar">
                <div class="sidebar-head">
                    <h3><span class="fa-fw open-close"><i class="ti-close ti-menu"></i></span> <span
                            class="hide-menu">Navigation</span></h3>
                </div>
                <ul class="nav" id="side-menu">
                    <li style="padding: 100px 0 0;">
                        <a href="habitaciones.jsp" class="waves-effect"><i class="fa fa-clock-o fa-fw"
                                aria-hidden="true"></i>Habitaciones</a>
                    </li>
                    <li>
                        <a href="reservaciones.jsp" class="waves-effect"><i class="fa fa-user fa-fw"
                                aria-hidden="true"></i>Reservaciones</a>
                    </li>
                    <li>
                        <a href="clientes.jsp" class="waves-effect"><i class="fa fa-table fa-fw"
                                aria-hidden="true"></i>Clientes</a>
                    </li>
                    <li>
                        <a href="inventario.jsp" class="waves-effect"><i class="fa fa-font fa-fw"
                                aria-hidden="true"></i>Inventario</a>
                    </li>
<!--                    <li>
                        <a href="usuarios.jsp" class="waves-effect"><i class="fa fa-globe fa-fw"
                                aria-hidden="true"></i>Usuarios</a>
                    </li>-->
                </ul>
                <div class="center p-20">
                    <a href="Logout"
                        class="btn btn-danger btn-block waves-effect waves-light">Salir</a>
                </div>
            </div>
        </div>
        <!-- ============================================================== -->
        <!-- End Left Sidebar -->
        <!-- ============================================================== -->