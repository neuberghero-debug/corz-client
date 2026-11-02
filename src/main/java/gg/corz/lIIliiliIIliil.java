package gg.corz;

import java.util.function.Predicate;

public record lIIliiliIIliil(String homeName, int intervalS, int cooldownMin, int waitAfterDeathS, boolean waitForAccept, Predicate<String> skip) {
   private final String lIiIiIlliiIiIiIlli;
   private final boolean IIIliIllilIIliIlli;
   private final int IliIiIllilliIiIlli;
   private final int iliIiIlliIiiIiIlli;
   private final int liiIiIlliiiiIiIlli;
   private final Predicate<String> iIIliIlliIlIliIlli;

   public int liiiIIllIl() {
      return this.IliIiIllilliIiIlli;
   }

   public String IliIlllilIi() {
      return this.lIiIiIlliiIiIiIlli;
   }

   public int IilliliilIIi() {
      return this.liiIiIlliiiiIiIlli;
   }

   public boolean lIiiIiIlilli() {
      return this.IIIliIllilIIliIlli;
   }

   public lIIliiliIIliil(String homeName, int intervalS, int cooldownMin, int waitAfterDeathS, boolean waitForAccept, Predicate<String> skip) {
      homeName = homeName == null ? "" : homeName.trim();
      intervalS = Math.max(3, intervalS);
      cooldownMin = Math.max(1, cooldownMin);
      waitAfterDeathS = Math.max(0, waitAfterDeathS);
      this.lIiIiIlliiIiIiIlli = homeName;
      this.IliIiIllilliIiIlli = intervalS;
      this.iliIiIlliIiiIiIlli = cooldownMin;
      this.liiIiIlliiiiIiIlli = waitAfterDeathS;
      this.IIIliIllilIIliIlli = waitForAccept;
      this.iIIliIlliIlIliIlli = skip;
   }

   public Predicate<String> iliIiiliiiii() {
      return this.iIIliIlliIlIliIlli;
   }

   public int iIlIlllllill() {
      return this.iliIiIlliIiiIiIlli;
   }
}
