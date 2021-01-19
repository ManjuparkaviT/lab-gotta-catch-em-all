package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;
import model.Pokemon;
@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur bul=new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.","POISON","IVYSAUR","64");
			
			msg = "<center>" + bul.getPokemonName() + "  #" + bul.getPokemonNumber();
			request.setAttribute("message1",msg);
			request.setAttribute("character1", bul.getCharacteristics());
			request.setAttribute("type1",bul.getType());
			request.setAttribute("evolution1",bul.getEvolution());
			request.setAttribute("baseExp1", bul.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			
			Charizard chari=new Charizard("Charizard",006,"Charizard is fit and strong and has the ability to soar up to ridiculous heights.With a single breath of fire, it can burn down forests and melt gigantic glaciers.","FIRE","CHARMELEON","240");
			
			msg = "<center>" + chari.getPokemonName() + "  #" + chari.getPokemonNumber();
			request.setAttribute("message2",msg);
			request.setAttribute("character2", chari.getCharacteristics());
			request.setAttribute("type2",chari.getType());
			request.setAttribute("evolution2",chari.getEvolution());
			request.setAttribute("baseExp2", chari.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	

			Dragonite drag=new Dragonite("Dragonite",149,"Dragonite is capable of flying faster than the speed of sound.It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.","DRAGON","DRATINI","270");
			
			msg = "<center>" + drag.getPokemonName() + "  #" + drag.getPokemonNumber();
			request.setAttribute("message3",msg);
			request.setAttribute("character3",drag.getCharacteristics());
			request.setAttribute("type3",drag.getType());
			request.setAttribute("evolution3", drag.getEvolution());
			request.setAttribute("baseExp3", drag.getBaseExp());
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			Mew me=new Mew("Mew",151,"Mew is a Psychic-type Mythical Pokémon introduced in Generation I.Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.","PSYCHIC","NONE","64" );	  
			msg = "<center>" + me.getPokemonName() + "  #" + me.getPokemonNumber();
			request.setAttribute("message4",msg);
			request.setAttribute("character4",me.getCharacteristics());
			request.setAttribute("type4",me.getType());
			request.setAttribute("evolution4",me.getEvolution());
			request.setAttribute("baseExp4", me.getBaseExp());
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	

			Pikachu pika=new Pikachu("Pikachu",25,"Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.","ELECTRIC","RAICHU","112");
			msg = "<center>" + pika.getPokemonName() + "  #" + pika.getPokemonNumber();
			request.setAttribute("message5",msg);
			request.setAttribute("character5", pika.getCharacteristics());
			request.setAttribute("type5",pika.getType());
			request.setAttribute("evolution5",pika.getEvolution());
			request.setAttribute("baseExp5", pika.getBaseExp());

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
