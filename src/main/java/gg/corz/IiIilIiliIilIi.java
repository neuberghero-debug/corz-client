package gg.corz;

import java.util.Locale;

public final class IiIilIiliIilIi {
   private IiIilIiliIilIi() {
   }

   public static String liiiIIllIl(
      int minSafeComponent, int ownedEscapeInside, boolean workInside, boolean reversibleTransition, boolean destinationComponentSize
   ) {
      if (minSafeComponent >= ownedEscapeInside) {
         return String.format(
            Locale.ROOT,
            iIlIlllllill<"iIlIlllllill","wzH5s9mbYQbtDphM5YuXmJGn3LHo+ypmhyl5W8uoU+FWDYJ9gYJywYxGfprdHsROewxzR6Di1g==">(),
            minSafeComponent,
            ownedEscapeInside
         );
      } else if (workInside) {
         return iIlIlllllill<"iIlIlllllill","D4Gkjp85VcFZM2Ax2BBUUbQ/PzlTRETI1FBpn9CxrJqsPllmmxNDekXoEI7nM6qr9xh3mEepIPXOSjwkGOr7NqXk7hZ5OMA8p4nCjuAhDlajAB8PCKM=">();
      } else if (reversibleTransition && destinationComponentSize) {
         return iIlIlllllill<"iIlIlllllill","Vlp6HXwSOQeOzSq+b7nLAxdFn2C+FskMGXNgrPVgwBNPiPXV90M/DVFcSV2rP+2FAG4DYp7LtuQ9ALu4iWhllPYHSzDmY8cCHDYQP8AQ">();
      } else {
         return reversibleTransition
            ? iIlIlllllill<"iIlIlllllill","34pfI1YVQay7W8BfTz+BneS3oFXU9WbyRRVt3p5ao/qXaPeHlxONWjZ6uSXwSb6EoYoesYM+jkPfXB0hs2/WyGtBysEiVTQQn7CeldxSHJ8=">()
            : String.format(
               Locale.ROOT,
               iIlIlllllill<"iIlIlllllill","j/UtcpB2QJjqzNdv97eaxyX+CXMeATbifaJJ5eb+p0sSeZc4DeHWwHfAVjdt4Ac5D4eo/RE0QotEGYQr0OxCg8yBTAP5JGKnVJdH/jqwy/7r7PwOnn9z6Cs=">(),
               minSafeComponent,
               ownedEscapeInside
            );
      }
   }

   public static boolean IliIlllilIi(
      int workInside, int ownedEscapeInside, boolean reversibleTransition, boolean minSafeComponent, boolean destinationComponentSize
   ) {
      if (workInside >= ownedEscapeInside) {
         return true;
      } else if (reversibleTransition) {
         return true;
      } else {
         return minSafeComponent ? true : destinationComponentSize && minSafeComponent;
      }
   }
}
