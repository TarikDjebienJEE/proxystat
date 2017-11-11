package com.dreamit.proxystat.model.service;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dreamit.proxystat.model.entities.Rating;

/**
 * Classe de test  
 * pour le service de commentaires
 * et de notations
 * @author RAKOTOBE Sitraka Eric
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class IRatingServiceTest {

	
	@Autowired 
	private IRatingService ratingService;
	
	private Long idRating1000WithoutService ;
	private Long idRating1006WithService ;
	private int nbRatingsToShow ; 
	
	@Before
	public void setUp() throws Exception{
		idRating1000WithoutService = new Long(1000);
		idRating1006WithService = new Long(1006);
		nbRatingsToShow = 5 ; 
	}
	
	
    /**
     * Methode permettant de tester si 
     * une liste de rating contient bien un
     * avec un id en parametre
     * @param flats : la liste des ratings
     * @param idRating : l'id du rating a chercher
     * @return vrai si idRating est dans flats, faux sinon
     */
    private boolean contains(List<Rating> ratings  , Long idRating) {
    	for (Rating rating : ratings) {
    		Long ratingDbId = rating.getId();
			if (idRating.equals(ratingDbId)){
				return true ; 
			}
		}
    	return false ;
	}	
	
	
    
    /**
     * Methode permettant de comparer deux 
     * rating seulement sur les champs notation et commentaires
     */
	private boolean areEqualsRating(Rating expected, Rating result) {
		int notationExpected = expected.getNotation();
		int notationResult = result.getNotation();
		String commentsExpected =  expected.getComment();
		String commentsResult =  result.getComment();
		
		if ((notationExpected == notationResult) && commentsExpected.equalsIgnoreCase(commentsResult)){
			return true ; 
		}
		return false ; 
	}	    
    
	
	
    /**
     * Test pour la méthode getHomeRatings()
     */
	@Test
    public void testRatingWithoutServiceAreInList() {
		List<Rating>  result = ratingService.getHomeRatings();

		Assert.assertTrue(contains(result,idRating1000WithoutService));

    }	
	
    /**
     * Test pour la méthode getHomeRatings()
     */
	@Test
    public void testRatingWithServiceAreNotInList() {
		List<Rating>  result = ratingService.getHomeRatings();

		Assert.assertTrue(contains(result,idRating1006WithService));

    }	
	
	
	
	
    /**
     * Test pour la méthode getHomeRatingsRestrict()
     */
	@Test
    public void getHomeRatingsRestrict() {
		int sizeExpected = 5 ; 
		
		List<Rating> resultQuery = ratingService.getHomeRatingsRestrict(nbRatingsToShow);
		int sizeResult = resultQuery.size() ; 
		
		Assert.assertEquals(sizeExpected , sizeResult);
    }	
	
	
	
    /**
     * Test pour la méthode saveHomeRating()
     */
	@Test
    public void testSaveHomeRatingSucceed() {
		Rating expected = new Rating();
		Date today = Calendar.getInstance().getTime();
		expected.setDate(today);
		expected.setNotation(5);
		expected.setComment("comments for test junit");
		Rating result = new Rating();
		
		result = ratingService.saveHomeRating(expected);
		
		Assert.assertTrue(areEqualsRating(expected , result));
    }


	
}
