package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	/**LEMBRE-SE NÃO PODEMOS TER O SET PARA A NOSSA LIST, QUE É NOSSA COMPOSIÇÃO NO LUGAR COLOCAMOS UM ADD OU REMOVE**/
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	public String toString() {
		
		/**Vamos usar o stringBuilder  
		 * usar concatenações '+' deixa o programa mais lento e por isso vamos melhorar a saida**/	
		
		StringBuilder sb = new 	StringBuilder();
		/**Vamos usar a função append que siginifica acrescentar no final, ela é usada para concatenar outras strings **/
		
		sb.append(title +" \n ");
		sb.append(likes);
		sb.append(" Likes -");
		sb.append(sdf.format(moment) + "\n ");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		
		for(Comment c : comments) {
			sb.append(c.getText());
		}
		return sb.toString();
	}
	
	
	}
