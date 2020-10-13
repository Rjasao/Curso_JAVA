package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String comentario;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date momento, String titulo, String comentario, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.comentario = comentario;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	//public void setComentarios(List<Comentario> comentarios) {
	//	this.comentarios = comentarios;
	//}
	
	public void addComentario (Comentario comentario) {
		comentarios.add(comentario);
		}
	
	public void removeComentario (Comentario comentario) {
		comentarios.remove(comentario);
		}

	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
		
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(comentario + "\n");
		sb.append("Comentários:\n");
		
		for (Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
		
	
}















