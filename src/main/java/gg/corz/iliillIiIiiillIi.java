package gg.corz;

public final class iliillIiIiiillIi {
   public static iiIIliIIlIli IliIlllilIi(boolean cellReplaceable, boolean cellIsOwnDirt) {
      if (cellReplaceable) {
         return iiIIliIIlIli.llIIIiIIlilIIIiIIl;
      } else {
         return cellIsOwnDirt ? iiIIliIIlIli.IiIIIiIIlliIIIiIIl : iiIIliIIlIli.iiIIIiIIlIIlIIiIIl;
      }
   }

   public static boolean liiiIIllIl(lliiiililiiiil phase, boolean columnPhysicallyReset) {
      return columnPhysicallyReset
         ? true
         : phase == lliiiililiiiil.lIlIIIiliiIlIIIili || phase == lliiiililiiiil.IllIIIililllIIIili || phase == lliiiililiiiil.illIIIiliIilIIIili;
   }

   public static lliiiililiiiil iIlIlllllill(lliiiililiiiil event, IIllilIilIllilIi phase) {
      return switch (phase) {
         case iIiilllIIi -> event == lliiiililiiiil.lIlIIIiliiIlIIIili ? lliiiililiiiil.IllIIIililllIIIili : event;
         case iliilllIIi -> event.ordinal() <= lliiiililiiiil.illIIIiliIilIIIili.ordinal() ? lliiiililiiiil.illIIIiliIilIIIili : event;
         case IliilllIIi -> event == lliiiililiiiil.iIiIIIiliIliIIIili ? lliiiililiiiil.iIiIIIiliIliIIIili : lliiiililiiiil.lilIIIiliiilIIIili;
         case IiiilllIIi -> event != lliiiililiiiil.lilIIIiliiilIIIili && event != lliiiililiiiil.IIiIIIililIiIIIili
         ? event
         : lliiiililiiiil.IIiIIIililIiIIIili;
         case liiilllIIi -> lliiiililiiiil.lIlIIIiliiIlIIIili;
         case lliilllIIi -> lliiiililiiiil.iIiIIIiliIliIIIili;
         case lIiilllIIi -> event;
      };
   }

   private iliillIiIiiillIi() {
   }
}
