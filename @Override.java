@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>Welcome to the Language Learning Platform</h1>");
}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    // Save or process user data
    request.setAttribute("message", "Registration successful!");
    request.getRequestDispatcher("profile.jsp").forward(request, response);
}
