package gg.corz;

public final class liiIlllliiiIllll {
   public static IliIlIlilliIlIli liiiIIllIl(
      boolean settled, boolean nudgeBudgetLeft, boolean holds, boolean feetIsStand, boolean solverAccepts, boolean settleBudgetLeft, boolean atCentre
   ) {
      if (!settled) {
         return IliIlIlilliIlIli.lliIIIllIi;
      } else if (!nudgeBudgetLeft) {
         return holds ? IliIlIlilliIlIli.lIiIIIllIi : IliIlIlilliIlIli.iIiIIIllIi;
      } else if (feetIsStand) {
         return IliIlIlilliIlIli.IIiIIIllIi;
      } else {
         return (!solverAccepts || !settleBudgetLeft) && atCentre ? IliIlIlilliIlIli.IliIIIllIi : IliIlIlilliIlIli.iliIIIllIi;
      }
   }

   private liiIlllliiiIllll() {
   }

   public static IliIlIlilliIlIli IliIlllilIi(boolean feetIsStand, boolean holds, boolean atCentre, boolean nudgeBudgetLeft, boolean solverAccepts) {
      return liiiIIllIl(feetIsStand, true, true, holds, atCentre, nudgeBudgetLeft, solverAccepts);
   }
}
