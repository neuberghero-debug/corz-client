package gg.corz;

public final class lIIliIiliIIliIil {
   private static final iIIllliIlIllli IllIIilIil = new iIIllliIlIllli(
      lllllIiillllIi.liililIiiiiililIii,
      iIlIlllllill<"iIlIlllllill","dZbjjtH8WRPAw30d0ttFtHUp58bnFhTh7SAu01YDAB4MOhnxt1Rd/ke1aLKFm1EFY8m3A9FcLp3TA+H2z4M/Ecgv3f0moHZTSvP8WtlWb6lzjU+JjkkSN/1H4YbP">()
   );
   private static final iIIllliIlIllli lllIIilIil = new iIIllliIlIllli(
      lllllIiillllIi.liililIiiiiililIii,
      iIlIlllllill<"iIlIlllllill","G+mQ882yXdgMSnz2l+FnqGNAW4y1d0om6npuiwzyVwRBdYMjbTMHSC5+ZPD5H/L5BbBUtgf0402wUGSx7sgn0dVcbCp7">()
   );
   private static final iIIllliIlIllli illIIilIil = new iIIllliIlIllli(
      lllllIiillllIi.liililIiiiiililIii,
      iIlIlllllill<"iIlIlllllill","6FATQpLEBgpCEkAtIa/V6ZXsGlQlIRLOy0/Id+5oyf2LG6PzD0gXnnJDusvVsPxej08LtsZ2JfoVntADob8OTDUJL5x60PcVsYBiMvZHzXxnlHsEyV2Rhjq1Fv85e+yh">()
   );
   private static final iIIllliIlIllli lilIIilIil = new iIIllliIlIllli(
      lllllIiillllIi.IIIiilIiilIIiilIii,
      iIlIlllllill<"iIlIlllllill","rChf4CJc64Sq0eB1/gskNFAY+ZUIhw+nYvHADZVjOBIxA8Ds4MuSIybhivev2SrAajgwLFMDTUB5PTA6henC3YEENliHvgORjDlKUo24exvbqj0tTzn5Jr4ShZ/VFIECANax/hEfrr4birKYFEUP8weoYiYCPPtB8rx1hMRzVpQqkw==">()
   );
   private static final iIIllliIlIllli IilIIilIil = new iIIllliIlIllli(
      lllllIiillllIi.iIIiilIiiIlIiilIii,
      iIlIlllllill<"iIlIlllllill","W89njZhgJ1hmVUjMam1aj37qW3HaUCpY2Bfke8msCtWTVyRfUhA9/fwlZ/oYEGIlXB4o0pK0mElqrAf2RnILUYl9XJerL+G4HWzATQ==">()
   );
   public static final int iIlIIilIil = 4;

   private lIIliIiliIIliIil() {
   }

   public static iIIllliIlIllli IliIlllilIi(
      boolean verticalSpeed,
      boolean collided,
      boolean onGround,
      double airborneByDesign,
      boolean sourceMatches,
      boolean settleTicks,
      int freshCommitment,
      int maxSettleTicks
   ) {
      if (settleTicks) {
         return IllIIilIil;
      } else if (!sourceMatches) {
         return IilIIilIil;
      } else if (!verticalSpeed
         || maxSettleTicks <= 0
         || freshCommitment >= maxSettleTicks
         || liiIlIliiiIlIl.lIiiIiIlilli(collided, airborneByDesign) && !onGround) {
         return !verticalSpeed
               || maxSettleTicks <= 0
               || freshCommitment < maxSettleTicks
               || liiIlIliiiIlIl.lIiiIiIlilli(collided, airborneByDesign) && !onGround
            ? lllIIilIil
            : illIIilIil;
      } else {
         return lilIIilIil;
      }
   }

   public static iIIllliIlIllli liiiIIllIl(
      boolean freshCommitment, boolean collided, boolean airborneByDesign, double sourceMatches, boolean onGround, boolean settleTicks, int verticalSpeed
   ) {
      return IliIlllilIi(freshCommitment, collided, airborneByDesign, sourceMatches, onGround, settleTicks, verticalSpeed, 4);
   }
}
