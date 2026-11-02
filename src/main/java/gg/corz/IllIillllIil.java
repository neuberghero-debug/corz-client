package gg.corz;

import java.util.Locale;

public record IllIillllIil(
   String kind, int members, boolean firstExecutable, llIiiIililIiiIil firstRejectReason, boolean dependencyChainValid, int predictedFirstActionTicks
) {
   private final String lIIliIliiIIliIli;
   private final boolean IIlliIlilIlliIli;
   private final llIiiIililIiiIil liIliIliiiIliIli;
   private final int iIlliIliIllliIli;
   private final boolean ilIliIliIiIliIli;
   private final int IlIliIlillIliIli;

   public int IilliliilIIi() {
      return this.IlIliIlillIliIli;
   }

   public String iIlIlllllill() {
      return this.lIIliIliiIIliIli;
   }

   public boolean IIIllIIliIIl() {
      return this.IIlliIlilIlliIli;
   }

   public boolean lIiiIiIlilli() {
      return this.ilIliIliIiIliIli;
   }

   public String liiiIIllIl() {
      return String.format(
         Locale.ROOT,
         IiIlliIliiIl<"IiIlliIliiIl","tJfCVQMe4HAZE+6K5BYDmZzIsHsEaugCNxTUSsE0njLDoyyGLFyhP2DVLk5BOgyqSO8/9nZohE1CAFEdNCCmQhdzeeEpcs9Vd0X11YRPRhYwW0VUQfhmBM6IDgEowGZmb86q/eOMTjF2/NxxyonLENrLK4li8Q0+Y7FcyVrOl+4YilZ0irf2LuAgaP2vJO58eSipEN8=">(),
         this.lIIliIliiIIliIli,
         this.IlIliIlillIliIli,
         this.ilIliIliIiIliIli,
         this.liIliIliiiIliIli,
         this.IIlliIlilIlliIli,
         this.iIlliIliIllliIli,
         this.IliIlllilIi()
            ? IiIlliIliiIl<"IiIlliIliiIl","QeEc8+DtQHza8GeQTVWD5ESqhU6pKFvRFmz3ZOfN5lSNaeME">()
            : IiIlliIliiIl<"IiIlliIliiIl","EvqDJGrCN6pvE+hklr/p1o/Pm8azYQyWxHuCkesErQ+rsh6N">()
      );
   }

   public boolean IliIlllilIi() {
      return this.ilIliIliIiIliIli && this.liIliIliiiIliIli == llIiiIililIiiIil.iilIlilIil;
   }

   public llIiiIililIiiIil iliIiiliiiii() {
      return this.liIliIliiiIliIli;
   }

   public IllIillllIil(
      String kind, int members, boolean firstExecutable, llIiiIililIiiIil firstRejectReason, boolean dependencyChainValid, int predictedFirstActionTicks
   ) {
      this.lIIliIliiIIliIli = kind;
      this.IlIliIlillIliIli = members;
      this.ilIliIliIiIliIli = firstExecutable;
      this.liIliIliiiIliIli = firstRejectReason;
      this.IIlliIlilIlliIli = dependencyChainValid;
      this.iIlliIliIllliIli = predictedFirstActionTicks;
   }

   public int IlIlllIlilIl() {
      return this.iIlliIliIllliIli;
   }
}
