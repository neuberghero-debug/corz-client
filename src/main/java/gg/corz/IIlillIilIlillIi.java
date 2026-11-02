package gg.corz;

public final class IIlillIilIlillIi {
   public static lIllIlliIllIll IliIlllilIi(String generation, int cellCount, long mine, llliiiIiilliiiIi jobId, llliiiIiilliiiIi theirs) {
      if (jobId != null && jobId.liiiIIllIl()) {
         if (jobId.IliIlllilIi()) {
            return new lIllIlliIllIll(liiilliiiiilli.illIiiIIIl, liiiIIllIl(jobId.lIiiIiIlilli(), cellCount));
         } else {
            return jobId.IIillIiliIil() == 0 && theirs != null && theirs.iIlIlllllill(generation, cellCount, mine)
               ? new lIllIlliIllIll(liiilliiiiilli.IilIiiIIIl, liiiIIllIl(theirs.lIiiIiIlilli(), cellCount))
               : new lIllIlliIllIll(liiilliiiiilli.lilIiiIIIl, liiiIIllIl(jobId.lIiiIiIlilli(), cellCount));
         }
      } else {
         return theirs != null && theirs.iIlIlllllill(generation, cellCount, mine)
            ? new lIllIlliIllIll(liiilliiiiilli.IilIiiIIIl, liiiIIllIl(theirs.lIiiIiIlilli(), cellCount))
            : new lIllIlliIllIll(liiilliiiiilli.iilIiiIIIl, jobId == null ? 0 : liiiIIllIl(jobId.lIiiIiIlilli(), cellCount));
      }
   }

   private static int liiiIIllIl(int max, int v) {
      return Math.max(0, Math.min(max, v));
   }

   private IIlillIilIlillIi() {
   }
}
