package com.sam.webtasks.client;

import com.sam.webtasks.basictools.Counterbalance;
import com.sam.webtasks.iotask2.IOtask2BlockContext;

public class Instructions {

	public static String Get(int index) {
		String i="";

		switch(index) {
		case 10:
			i="Dans cette tâche vous verrez une séquence de lettres, les unes après les autres.<br><br> "
					+ "Si la lettre correspond à celle que avez vue deux lettres précédentes, merci d'appuyer sur la touche <b>X</b> "
					+ "Sinon, appuyez sur la touche  <b>Z</b>.<br><br> Par exemple, si vous voyez la séquence "
					+ "O A S A P, vous devriez appuyer sur les touches Z Z Z X Z.<br><br> "
					+ "Merci de répondre aussi rapidement et précisément que possible.";
			break;
		case 20:
			i = "En même temps que cette tâche, vous aurez également une tâche de minuterie."
					+ "Une horloge digitale s'affichera au-dessus des lettres. On vous demandera "
					+ "d'appuyer sur la touche <b>espace</b> à un moment particulier.<br><br> Par exemple, vous pourriez recevoir "
					+ "l'instruction \"Appuyez sur la touche espace à 0:20\". Lorsque vous voyez un message comme celui-ci,  "
					+ "vous devez d'abord appuyer sur la touche espace pour poursuivre la tâche. "
					+ "Vous devez poursuivre la tâche des lettres comme auparavant. Ensuite, lorsque "
					+ "l'horloge indique l'heure spécifique (telle que 0:20), vous devez appuyer une nouvelle fois "
					+ "sur la touche espace. Après ceci, vous continuerez avec la tâche des lettres.<br><br>"
					+ "Le plus important est de continuer avec la tâche des lettres aussi rapidement et précisément que possible. "
					+ "Il est plus important que vous portiez votre attention aux lettres plutôt qu'à l'horloge. "
					+ "Mais vous devez essayer de faire la tâche de la minuterie en même temps, si vous le pouvez.<br><br> "
					+ "Si vous appuyez sur la touche espace dans les deux secondes avant et suivant l'heure "
					+ "indiquée (par exemple 0:18 à 0:22), cela sera considéré comme correct. ";
			break;	
		case 21:
			i = "Maintenant, vous allez à nouveau vous entrainer à la tâche, mais, cette fois-ci, "
					+ "l'horloge ne restera pas automatiquement sur l'écran.<br><br> Vous pouvez faire apparaître l'horloge "
					+ "pour vérifier l'heure à tout moment en appuyant su la touche <b>M</b>. Vous pouvez faire ceci "
					+ "autant de fois que vous le souhaitez <br><br> .Pour la suite de l'expérience, vous devrez appuyer sur la touche <b>M</b>." 
					+ "pour faire apparaître l'horloge. <br><br> À chaque fois qu'on vous demande d'appuyer sur la touche espace, "
					+ "vous ne pouvez le faire qu' <b>une fois</b>. Par exemple, si on vous demande d'appuyer sur la touche espace "
					+ "à 0:20 et que vous avez déjà appuyé à 0:15, cela ne sera pas compté si vous appuyez une nouvelle fois. "
					+ "C'est pour cela que vous ne devriez appuyer sur la touche espace que lorsque c'est l'heure de le faire. <br><br> "
					+ "Merci de cliquer ci-dessous afin de vous entrainer. ";

			break;
		case 22:
			i = "À chaque fois que vous devez appuyer"
					+ "sur la touche espace, vous ne pouvez le faire qu'<b>une fois</b>. Par exemple, si vous devez appuyer sur la touche espace à "
					+ "0:20 et que vous avez déjà appuyé à 0:15, cela ne comptera pas si vous appuyez une nouvelle fois. Vous ne devez donc appuyer sur "
					+ "la touche espace quand c'est le moment de le faire.<br><br>Merci de cliquer ci-dessous pour faire un autre entrainement.";
			break;
		case 30:
			i = "Dans l'expérience principale, vous obtiendrez un point à chaque fois que vous appuyez sur la bonne touche "
					+ "dans la tâches des <b>lettres</b>. Si votre score final se trouve dans la moitié supérieure "
					+ "des participants, vous recevrez un paiement bonus de £1.<br><br> "
					+ "Maintenant, faisons davantage d'entrainement sur le tâche que vous venez de faire <br><br> "
					+ "Lorsque vous recevez l'instruction d'appuyer sur la touche espace, il y aura toujours "
					+ "une attente de <b> 10 secondes </b> jusqu'à ce que vous deviez appuyer sur la touche.<br><br> ";
			break;
		case 40:
			i = "Maintenant que vous vous êtes entrainé, nous aimerions que vous nous indiquiez la précision avec laquelle "
					+ "vous pensez pouvoir compléter la tâche de minuterie, lorsqu'il s'agit d'exactement la même tâche que celle que vous "
					+ "venez de faire, avec une <b>attente de 10 secondes</b> avant d'appuyer sur la touche espace.<br><br> "
					+ " Merci d'utiliser l'échelle ci-dessous afin d'indiquer le pourcentage de fois où vous vous "
					+ "souviendrez d'appuyer correctement sur la touche espace lorsqu'il y a une <b>attente de 10 secondes</b>. "
					+ "<br><br>100% signifierait que vous obtiendrez toujours la réponse correcte. "
					+ "0% signifierait que vous n'obtiendrez aucune réponse correcte. ";

			break;
		case 50:
			i = "Maintenant, nous allons continuer à nous entrainer à la tâche, mais cette fois-ci il y aura "
					+ "toujours une <b>attente de 20 secondes</b> dans la tâche de minuterie. ";
			break;
		case 60:
			i = "Maintenant que vous avez un peu de pratique, nous aimerions que vous nous indiquiez la précision avec laquelle "
					+ "vous pensez pouvoir compléter la tâche de minuterie, lorsqu'il s'agit d'exactement la même tâche que celle "
					+ "que vous venez de faire, avec une <b>attente de 20 secondes</b> avant d'appuyer sur la touche espace.<br><br> "
					+ "Merci d'utiliser l'échelle ci-dessous afin d'indiquer le pourcentage de fois où vous vous "
					+ "souviendrez d'appuyer correctement sur la touche espace lorsqu'il y a une <b>attente de 20 secondes</b>. "
					+ "<br><br>100% signifierait que vous obtiendrez toujours la réponse correcte. "
					+ "0% signifierait que vous n'obtiendrez aucune réponse correcte. ";
			break;
		case 70:
			i = "Maintenant, nous allons continuer à nous entrainer à la tâche, mais cette fois-ci il y aura "
					+ "toujours une <b>attente de 30 secondes</b> dans la tâche de minuterie. ";
			break;
		case 80:
			i = "Maintenant que vous vous êtes entrainé, nous aimerions que vous nous indiquiez la précision avec laquelle "
					+ "vous pensez pouvoir compléter la tâche de minuterie, lorsqu'il s'agit d'exactement la même tâche que celle que vous "
					+ "venez de faire, avec une <b>attente de 30 secondes</b> avant d'appuyer sur la touche espace.<br><br> "
					+ " Merci d'utiliser l'échelle ci-dessous afin d'indiquer le pourcentage de fois où vous vous "
					+ "souviendrez d'appuyer correctement sur la touche espace lorsqu'il y a une <b>attente de 10 secondes</b>. "
					+ "<br><br>100% signifierait que vous obtenez toujours la réponse correcte. "
					+ "0% signifierait que vous n'obtenez aucune réponse correcte. ";
			break;
		case 90:
			i = "Une dernière chose concernant la tâche. Parfois, il y aura un bouton sur l'écran indiquant "
					+ " \"Rappelle-moi\". Une fois qu'on vous a indiqué d'appuyer sur la touche espace "
					+ "à un moment particulier, vous pouvez utiliser ce bouton en guise de rappel. Vous devez appuyer "
					+ "sur ce bouton <b>5 fois</b> pour programmer un rappel. Cela signifie que lorsque c'est presque "
					+ "le moment d'appuyer sur la touche espace, l'horloge va commencer à clignoter afin de vous le rappeler.<br><br> "
					+ "Merci d'essayer d'utiliser ce bouton maintenant. ";
			break;
		case 100:
			i = "Lorsque le bouton \"Rappelle-moi\" est sur l'écran, vous êtes entièrement libre de l'utiliser ou non. Vous pouvez programmer "
					+ "des rappels si vous le souhaitez, ou vous pouvez vous souvenir d'appuyer sur la touche espace avec votre propre "
					+ "mémoire, sans installer de rappel. C'est votre choix, vous devriez donc faire ce que vous préférez.<br><br> "
					+ "Il s'agit de la fin de l'entrainement. L'expérience principale va maintenant débuter. ";
			break;
		case 110:
			i = "Il est temps de faire une pause. Appuyez sur le bouton ci-dessous pour continuer l'expérience. ";
			break;
		case 120:
			i = "Vous avez maintenant terminé la tâche. Maintenant que vous avez fini, merci de nous indiquer la précision avec laquelle vous "
					+ "pensez pouvoir compléter la tâche de minuterie, lorsque vous utilisez juste votre propre mémoire (sans rappels), "
					+ "avec une <b>attente de 10 secondes</b> avant d'appuyer sur la touche espace. <br><br> "
					+ "Merci d'utiliser l'échelle ci-dessous afin d'indiquer le pourcentage de fois où vous vous "
					+ "souviendrez d'appuyer correctement sur la touche espace lorsqu'il y a une <b>attente de 10 secondes</b>. "
					+ "<br><br>100% signifierait que vous obtenez toujours la réponse correcte. "
					+ "0% signifierait que vous n'obtenez aucune réponse correcte. ";
			break;
		case 130:
			i = "Maintenant, merci de nous indiquer la précision avec laquelle vous "
					+ "pensez pouvoir compléter la tâche de minuterie, lorsque vous utilisez juste votre propre mémoire (sans rappels),"
					+ "avec une <b>attente de 20 secondes</b> avant d'appuyer sur la touche espace.<br><br> "
					+ "Merci d'utiliser l'échelle ci-dessous afin d'indiquer le pourcentage de fois où vous vous "
					+ "souviendrez d'appuyer correctement sur la touche espace lorsqu'il y a une <b>attente de 20 secondes</b>."
					+ "<br><br>100% signifierait que vous obtenez toujours la réponse correcte. "
					+ "0% signifierait que vous n'obtenez aucune réponse correcte. ";
			break;
		case 140:
			i = "Maintenant, merci de nous indiquer la précision avec laquelle vous "
					+ "pensez pouvoir compléter la tâche de minuterie, lorsque vous utilisez juste votre propre mémoire (sans rappels), "
					+ "avec une <b>attente de 30 secondes</b> avant d'appuyer sur la touche espace.<br><br> "
					+ "Merci d'utiliser l'échelle ci-dessous afin d'indiquer le pourcentage de fois où vous vous "
					+ "souviendrez d'appuyer correctement sur la touche espace lorsqu'il y a une <b>attente de 30 secondes</b>. "
					+ "<br><br>100% signifierait que vous obtenez toujours la réponse correcte. "
					+ "0% signifierait que vous n'obtenez aucune réponse correcte. ";
			break;
		case 150:
			i = "Vous avez maintenant terminé l'expérience. Merci pour votre participation.<br><br> "
					+ "Merci de cliquer sur le lien ci-dessous afin de recevoir votre paiement : "
					+ "<b><a href=\"https://app.prolific.co/submissions/complete?cc=7EB98BB9\">"
					+ "CLIQUER ICI</a></b> ";
			break;
		}

		return(i);	
	}

	public static String InfoText() {
		return ("Nous aimerions vous inviter à participer à un projet de recherche. "
				+ "Vous ne devez participer que si vous le souhaitez ; choisir de ne pas participer "
				+ "ne vous désavantagera d'aucune façon. Avant de décider si vous souhaitez participer, "
				+ "merci de lire attentivement les informations suivantes et d'en discuter avec des autres "
				+ "personnes si vous le souhaitez. N'hésitez pas à nous poser des questions si quelque chose n'est pas clair "
				+ "ou si vous souhaitez davantage d'informations.<br><br> "
				+ "Nous recrutons des volontaires afin de participer à une expérience "
				+ "ayant pour but d'améliorer notre compréhension de l'attention et de la mémoire humaine. "
				+ "Vous verrez une variété de stimuli sur votre écran, comme des lettres de l'alphabet "
				+ "et on vous demandera de répondre en appuyant sur des touches de votre clavier. Parfois, on vous demandera "
				+ "à quel point vous êtes confiant dans votre capacité à compléter la tâche. "
				+ "L'expérience durera environ 1 heure et vous recevrez un paiement de £7.50 par le biais "
				+ "du système de paiement Prolific Academic. IL n'y a pas de risques anticipés ou de bénéfices "
				+ "liés à la participation à cette étude. <br><br> "
				+ "C'est à vous de décider si vous souhaitez participer. Si vous choisissez "
				+ "de ne pas participer, vous ne subirez aucune pénalité ou ne perdrez aucune "
				+ "prestation à laquelle vous auriez pu prétendre. Cependant, si vous décidez "
				+ "de participer, vous pouvez imprimer cette page d'information et "
				+ "on vous demandera de compléter un formulaire de consentement sur la page suivante. "
				+ "Même après avoir accepté de participer, "
				+ "vous pouvez toujours vous retirer à tout moment et sans donner de raison. Si vous vous retirez "
				+ "avant la fin de l'expérience, nous ne conserverons pas vos données et elles ne seront pas analysées. "
				+ "<br><br> Toutes les données seront récoltées et stockées conformément au règlement général sur la protection des données de 2018. "
				+ "Les informations personnelles sont stockées séparément des résultats des tests, "
				+ "et les chercheurs sur ce projet n'ont pas accès à ces données. Vos informations personnelles telles que le nom et l'adresse mail "
				+ "sont détenues par Prolific Academic mais les chercheurs sur ce projet n'y ont pas accès. "
				+ "Les données de cette expérience peuvent être mises à la disposition de la communauté des chercheurs,"
				+ "par exemple en les publiant sur un site internet tel que l'Open Science Framework(<a href=\"http://osf.io\">http://osf.io</a>). "
				+ "Il ne sera pas possible de vous identifier à partir de ces données.<br><br> "
				+ "Nous souhaitons publier les résultats de ce projet dans des revues scientifiques et des chapitres de livres. "
				+ "Des copies des résultats peuvent être obtenues directement sur les sites web des revues scientifiques ou en nous contactant.<br><br> "
				+ "Si vous souhaitez déposer une plainte, veuillez contacter le chercheur principal de ce projet, "
				+ "le Professeur Sam Gilbert (<a href=\"mailto:sam.gilbert@ucl.ac.uk\">sam.gilbert@ucl.ac.uk</a>). "
				+ "Cependant, si vous estimez que votre plainte n'a pas été traitée de façon satisfaisante, sachez que vous pouvez également contacter "
				+ "le président du comité d'éthique de la recherche l'UCL. (<a href=\"mailto:ethics@ucl.ac.uk\">ethics@ucl.ac.uk</a>).");
	}
}
