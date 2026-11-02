package gg.corz;

import java.util.Set;

public final class IIiilIIilIiilIIi {
   public static final Set<String> iIlIiIiiil = Set.of(
      liiiIIllIl<"liiiIIllIl","pBlALMgobGe/fTrNb/5PqWGDQXsnk4YhKMVCxMNyVp+nwQ==">(),
      liiiIIllIl<"liiiIIllIl","iFfof9ggxZ3Vn5daRW83SMa1PrEEBiEwO2PMIFqRvEXrm3E3">(),
      liiiIIllIl<"liiiIIllIl","ZfkTmkZNwtSzT6mKmtvgepmlEBIow4HmDV/+K6rvGWJaOHBEFBqruU3SZwU=">(),
      liiiIIllIl<"liiiIIllIl","3mK8+fVwHjuNiOY7tlI+6XotntiFd6g/WDrvlWnNecP/Bq17yg5Xqxhgzetz">(),
      liiiIIllIl<"liiiIIllIl","o+podZqKgECR6DV6lcn3H5Ndrn12DqWNlxlrmXCEEIuthRbfYQ==">()
   );
   public static final Set<String> lIlIiIiiil = Set.of(
      liiiIIllIl<"liiiIIllIl","D1NBMxIzSc6M9LeVARwuAU/brL7J+tYga52lXYiZ6P1QW1A3ew==">(),
      liiiIIllIl<"liiiIIllIl","IExVGDDJp8e7YZ8HSci0Rs/4MM+aerBCRerNutiY6HhuXR811/U=">(),
      liiiIIllIl<"liiiIIllIl","uo+jp+hGekzP2NVzHuA9NJRFKikYqgAiEoQcqgqY0w3pEFOnzT0GEZ1F0ZU=">(),
      liiiIIllIl<"liiiIIllIl","Dgod6/kXpHl3InMkBU4FW6crmKq3DeI8XwKFac0DdpkK0gE0tg==">(),
      liiiIIllIl<"liiiIIllIl","M5/V0SNhqLqCu26MlupICrCUTcmTs/1nJvhZUb6DMFNpXUE=">(),
      liiiIIllIl<"liiiIIllIl","DzWbR5iPHVzea0h9LEHKc6rd1Oq91tr5QnRGkdHyKpLJXMkU">(),
      liiiIIllIl<"liiiIIllIl","PVhCjiVOUeep5kEDaAfg7oa4KTyDmbMrMzqKiVs945zOn6cxIoGcLU4T">(),
      liiiIIllIl<"liiiIIllIl","YikzdAW3T+j/q4o/BomBR3hGIy+WnV5lE18TOQV08mKj">(),
      liiiIIllIl<"liiiIIllIl","e7nzKjuOufePupFk4ouzTi8M7Etkc6lxqc7QRc9wNuY6QjE=">(),
      liiiIIllIl<"liiiIIllIl","nPRjytYZN/kewUauf0TombW3YGI0y+C3033A+LWmOGF8OXAOHQ==">(),
      liiiIIllIl<"liiiIIllIl","pI88x8xv+m/9C57Z4U5nUgbsrxFm5TKorVGQffPGhVyKx996z+p5xvTu">(),
      liiiIIllIl<"liiiIIllIl","1GuxF5GlQYuGqjvmJ25ggj8VO3/h1H7ybX8Vf+saboo+zJotzg==">(),
      liiiIIllIl<"liiiIIllIl","ejBgvNd8tVPXt2PibKez6kcyzhcWKGv/TUVVkvDG46G02g==">(),
      liiiIIllIl<"liiiIIllIl","X0L+Ygaw5sI7V9wZQA6sqKukeh3WTdV+RCDvkSrqTbxS70Pn">(),
      liiiIIllIl<"liiiIIllIl","FhxmsemkvCQZOPUsEQL53JRD0KDhV1+YHlXRV2laLXX19LRFGA==">(),
      liiiIIllIl<"liiiIIllIl","fTJZDxvGUQUIjG+I0lTj6XjFnNBu6N2I2naSQh7KyQ4U">(),
      liiiIIllIl<"liiiIIllIl","Z/iRiXL9uYh4P0D8l6IVwToahSalDCklqGqQvandQqVR47yN">(),
      liiiIIllIl<"liiiIIllIl","yS4CU1mQMUUgfX+kMSOxZjgQtwxljx9/gmeKjEB9UsAmnmQMuo6YLqo=">()
   );
   public static final Set<String> IllIiIiiil = Set.of(liiiIIllIl<"liiiIIllIl","zJDSkvCRZzGd95QDrYbJ7XwNv1FIKdE7yYgiEgNQNlw7Dbzy">());

   public static IIilIiIilIilIiIi IliIlllilIi(String isOtherBot, boolean simpleName) {
      if (simpleName) {
         return IIilIiIilIilIiIi.llliIIiIIi;
      } else if (isOtherBot == null) {
         return IIilIiIilIilIiIi.lIliIIiIIi;
      } else if (IllIiIiiil.contains(isOtherBot)) {
         return IIilIiIilIilIiIi.llliIIiIIi;
      } else if (lIlIiIiiil.contains(isOtherBot)) {
         return IIilIiIilIilIiIi.iIliIIiIIi;
      } else {
         return iIlIiIiiil.contains(isOtherBot) ? IIilIiIilIilIiIi.IlliIIiIIi : IIilIiIilIilIiIi.lIliIIiIIi;
      }
   }

   private IIiilIIilIiilIIi() {
   }
}
