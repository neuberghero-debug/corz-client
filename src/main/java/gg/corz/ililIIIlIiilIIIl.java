package gg.corz;

import java.util.Locale;

public final class ililIIIlIiilIIIl {
   private ililIIIlIiilIIIl() {
   }

   public static Iliiilllliiill IliIlllilIi(
      int minSafeComponent, int hasSafeReturnPath, boolean postComponentSize, boolean hasSafeContinuation, boolean ownedRemovableEscape
   ) {
      if (minSafeComponent < hasSafeReturnPath && !ownedRemovableEscape && !hasSafeContinuation) {
         return new Iliiilllliiill(
            IIIIlIilIIIlIi.iliIiIIiiIiiIiIIii,
            minSafeComponent,
            String.format(
               Locale.ROOT,
               iIlIlllllill<"iIlIlllllill","/R37xMqe7lwWAR57E6lyRNxeh4rTHbX0+Etkx3hV21YHit4RnXhLkujAB4OsF9w4ZNeGOGcBGvKpphIL30Tri/v/0OOOSWS/RuyBM8rKs1ns8pfrb7CYOU4TNJAlnF4JiBDX9g==">(),
               minSafeComponent,
               hasSafeReturnPath
            )
         );
      } else if (postComponentSize || hasSafeContinuation) {
         return new Iliiilllliiill(
            IIIIlIilIIIlIi.lIiIiIIiiiIiIiIIii,
            minSafeComponent,
            postComponentSize
               ? iIlIlllllill<"iIlIlllllill","rTRlu9larq4qKrPYgVTmAnZAlqC1klIXwTxy93z71ov/bL0Hkm2UkqVYMwIbkIAg5tO7BKXFmNdmr/829QMRyu+hWaA=">()
               : iIlIlllllill<"iIlIlllllill","4LZ/oOqrY4Z4+lYozKj1zzbrXp7dc0ugYyx+BLxBN7ETmGuRrNY8b1EHKlh449NglXPBJN8dAF7ipCrnIsrC9mP6c1VHm2wFbZRBvEri">()
         );
      } else {
         return ownedRemovableEscape
            ? new Iliiilllliiill(
               IIIIlIilIIIlIi.IliIiIIiilliIiIIii,
               minSafeComponent,
               iIlIlllllill<"iIlIlllllill","46/bXRtj7oyIMWh99e1Vq/N8Qa1OLUFatu3CDV10X/YBcFVljazofed2zQTyrk2sZKGXo3yGYE6BihZCltwEz1FsVJXOp8m7OVO7gWMbzXS3dWF//H/yBopdKIgkrKub8QgWvvpf0omeQvABOqKiIJeeFEIJ">()
            )
            : new Iliiilllliiill(
               IIIIlIilIIIlIi.iliIiIIiiIiiIiIIii,
               minSafeComponent,
               iIlIlllllill<"iIlIlllllill","yTF7Uh2jVQXj6ctiW7Zs59H6sltZVGVJUCqFrBfJwi73i3yUELqzZB88o0Oik3H6u+3zGt9OSvaCRHpamUj/7PtKpK0YoHOtFkVPQ8DLrA3aV24h750V/3bJ8e1+PiyM6g==">()
            );
      }
   }

   public static Iliiilllliiill liiiIIllIl(
      int hasSafeReturnPath, int minSafeComponent, boolean hasSafeContinuation, boolean postComponentSize, boolean ownedRemovableEscape
   ) {
      Iliiilllliiill var5 = IliIlllilIi(hasSafeReturnPath, minSafeComponent, hasSafeContinuation, postComponentSize, ownedRemovableEscape);
      return new Iliiilllliiill(
         var5.IilliliilIIi(), var5.lIiiIiIlilli(), iIlIlllllill<"iIlIlllllill","M8NX5KgBBiqG9+7zw3p3rLagougBrq/V0TqDpoI9Z0ArFyP36bA=">() + var5.iliIiiliiiii()
      );
   }
}
