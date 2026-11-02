package gg.corz;

import net.minecraft.class_243;

public record iiliiiIiIIiiiiIi(
   iIliIiIiIlliIiIi state,
   iIlIIillIllIIill proposal,
   double proposalValue,
   iiiIiiIlIIIliiIl abort,
   iIlIIIIiIllIIIIi lane,
   llillIIlilillIIl crystal,
   llIlilIlilIlilIl strike,
   iIiIiilIliIiil pearl,
   IIiIllIiIl anchor,
   IlliIiIlllliIiIl stand,
   class_243 aimPoint,
   int killInTicks,
   int yields,
   String status,
   String arm
) {
   private final int lilliIIlIi;
   private final double liIliIIlIi;
   private final llIlilIlilIlilIl iIlliIIlIi;
   private final class_243 IilliIIlIi;
   private final String IIiliIIlIi;
   private final iIlIIillIllIIill IiIliIIlIi;
   private final iiiIiiIlIIIliiIl iiIliIIlIi;
   private final String lIiliIIlIi;
   private final IlliIiIlllliIiIl illliIIlIi;
   private final IIiIllIiIl lllliIIlIi;
   private final iIliIiIiIlliIiIi ilIliIIlIi;
   private final iIiIiilIliIiil IllliIIlIi;
   private final iIlIIIIiIllIIIIi IIlliIIlIi;
   private final llillIIlilillIIl lIlliIIlIi;
   public static final iiliiiIiIIiiiiIi iIiliIIlIi = new iiliiiIiIIiiiiIi(
      iIliIiIiIlliIiIi.lllIiIiIIi,
      iIlIIillIllIIill.lliilllill,
      0.0,
      iiiIiiIlIIIliiIl.lliiIlIlll,
      iIlIIIIiIllIIIIi.lliiliIiil,
      null,
      null,
      null,
      null,
      null,
      null,
      Integer.MAX_VALUE,
      0,
      null,
      null
   );
   private final int iilliIIlIi;

   public String IlIillIiilIi() {
      return this.lIiliIIlIi;
   }

   public int Ililllililil() {
      return this.lilliIIlIi;
   }

   public iiliiiIiIIiiiiIi(
      iIliIiIiIlliIiIi state,
      iIlIIillIllIIill proposal,
      double proposalValue,
      iiiIiiIlIIIliiIl abort,
      iIlIIIIiIllIIIIi lane,
      llillIIlilillIIl crystal,
      llIlilIlilIlilIl strike,
      iIiIiilIliIiil pearl,
      IIiIllIiIl anchor,
      IlliIiIlllliIiIl stand,
      class_243 aimPoint,
      int killInTicks,
      int yields,
      String status,
      String arm
   ) {
      this.ilIliIIlIi = state;
      this.IiIliIIlIi = proposal;
      this.liIliIIlIi = proposalValue;
      this.iiIliIIlIi = abort;
      this.IIlliIIlIi = lane;
      this.lIlliIIlIi = crystal;
      this.iIlliIIlIi = strike;
      this.IllliIIlIi = pearl;
      this.lllliIIlIi = anchor;
      this.illliIIlIi = stand;
      this.IilliIIlIi = aimPoint;
      this.lilliIIlIi = killInTicks;
      this.iilliIIlIi = yields;
      this.IIiliIIlIi = status;
      this.lIiliIIlIi = arm;
   }

   public iIliIiIiIlliIiIi iIlIlllllill() {
      return this.ilIliIIlIi;
   }

   public class_243 IIillIiliIil() {
      return this.IilliIIlIi;
   }

   public boolean IliIlllilIi() {
      return this.ilIliIIlIi != iIliIiIiIlliIiIi.lllIiIiIIi;
   }

   public iIlIIillIllIIill IilliliilIIi() {
      return this.IiIliIIlIi;
   }

   public IIiIllIiIl Illlllllilll() {
      return this.lllliIIlIi;
   }

   public IlliIiIlllliIiIl Iilllilliill() {
      return this.illliIIlIi;
   }

   public llIlilIlilIlilIl IiIlliIliiIl() {
      return this.iIlliIIlIi;
   }

   public llillIIlilillIIl IlIlllIlilIl() {
      return this.lIlliIIlIi;
   }

   public iiiIiiIlIIIliiIl iliIiiliiiii() {
      return this.iiIliIIlIi;
   }

   public iIiIiilIliIiil IIlllIlliIll() {
      return this.IllliIIlIi;
   }

   public int Iiilliiliiil() {
      return this.iilliIIlIi;
   }

   public iIlIIIIiIllIIIIi IIIllIIliIIl() {
      return this.IIlliIIlIi;
   }

   public double lIiiIiIlilli() {
      return this.liIliIIlIi;
   }

   public String IIIilIIiiIIi() {
      return this.IIiliIIlIi;
   }

   public boolean liiiIIllIl() {
      return this.ilIliIIlIi == iIliIiIiIlliIiIi.lliIiIiIIi;
   }
}
