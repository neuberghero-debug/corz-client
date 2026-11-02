package gg.corz;

public final class iIIllIilIlIllIil {
   public static IlilllIlllilllIl IliIlllilIi(
      boolean standableNow, boolean supportIsOwnedTemp, boolean headCellWantedBySchematic, boolean survivalProven, boolean feetCellWantedBySchematic
   ) {
      if (!standableNow) {
         return IlilllIlllilllIl.IllIIIliIl;
      } else if (feetCellWantedBySchematic) {
         return IlilllIlllilllIl.IIlIIIliIl;
      } else if (supportIsOwnedTemp || headCellWantedBySchematic) {
         return IlilllIlllilllIl.lIlIIIliIl;
      } else {
         return survivalProven ? IlilllIlllilllIl.iIlIIIliIl : IlilllIlllilllIl.IIlIIIliIl;
      }
   }

   private iIIllIilIlIllIil() {
   }

   public static boolean liiiIIllIl(IlilllIlllilllIl d) {
      return d == IlilllIlllilllIl.IIlIIIliIl;
   }

   public static boolean iIlIlllllill(int durable, int viable) {
      return durable > 0 && viable == 0;
   }
}
