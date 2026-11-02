package gg.corz;

import java.util.Iterator;
import java.util.Map;

public final class IIllllIllIllllIl {
   public static IlIiliilllIiliil IilliliilIIi(
      int heldHere, int anyCandidateAbove, int lowestCandidateIsHere, boolean dispatchableHere, boolean tempSolvableHere, int interactiveWaitHere
   ) {
      if (!Iiilliilliilliil.IIiilIiiiIii(heldHere, anyCandidateAbove)) {
         return IlIiliilllIiliil.lliIIIIiil;
      } else if (interactiveWaitHere > 0) {
         return IlIiliilllIiliil.iiiIIIIiil;
      } else if (!dispatchableHere) {
         return IlIiliilllIiliil.IiiIIIIiil;
      } else if (lowestCandidateIsHere > 0) {
         return IlIiliilllIiliil.iliIIIIiil;
      } else {
         return tempSolvableHere ? IlIiliilllIiliil.IiiIIIIiil : IlIiliilllIiliil.liiIIIIiil;
      }
   }

   public static long lIiiIiIlilli(
      long deferCount,
      int tempAccessBanned,
      int activeLayer,
      long inventorySignature,
      Map<Long, Integer> worldRevision,
      int cooldowns,
      int anchorLayer,
      int failMemorySize,
      boolean tempBlocks,
      long feetCell,
      int tick
   ) {
      long var22 = -49066701657543941L;
      long var24 = 1853667927977326263L;
      var22 ^= (0L ^ var22) & -1L << 32;
      Iterator var15 = worldRevision.values().iterator();

      while (var15.hasNext()) {
         var22 ^= ((long)((Integer)var15.next()).intValue() ^ var22) & -1L >>> 32;
         if (cooldowns >= (int)var22) {
            var22 += 4294967296L;
         }
      }

      long var26 = -3750763034362895579L;
      long[] var17 = new long[]{
         deferCount,
         (long)tempAccessBanned,
         (long)activeLayer,
         inventorySignature,
         (long)worldRevision.size(),
         (long)((int)(var22 >>> 32)),
         (long)anchorLayer,
         (long)failMemorySize,
         tempBlocks ? 1L : 0L,
         feetCell,
         (long)tick
      };
      var24 ^= ((long)var17.length << 32 ^ var24) & -1L << 32;

      for (long var29 = var24 ^ (0L ^ var24) & -1L >>> 32; (int)var29 < (int)(var29 >>> 32); var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
         long var20 = var17[(int)var29];
         var26 = (var26 ^ var20) * 1099511628211L;
      }

      return var26;
   }

   private IIllllIllIllllIl() {
   }

   public static iiiilillIIIIiill iliIiiliiiii(
      int chebyshevFromRecordedFeet, int recordedFeetInComponent, long recordedWorldRev, long worldRev, boolean regionStep
   ) {
      if (chebyshevFromRecordedFeet <= recordedFeetInComponent) {
         return iiiilillIIIIiill.iIillliill;
      } else if (recordedWorldRev != worldRev) {
         return iiiilillIIIIiill.lIillliill;
      } else {
         return regionStep ? iiiilillIIIIiill.iilllliill : iiiilillIIIIiill.IIillliill;
      }
   }

   public static boolean IIIllIIliIIl(iiiilillIIIIiill s) {
      return s == iiiilillIIIIiill.iilllliill || s == iiiilillIIIIiill.iIillliill;
   }

   public static IlIiliilllIiliil iIlIlllllill(
      int interactiveWaitHere, int tempSolvableHere, int dispatchableHere, boolean anyCandidateAbove, boolean lowestCandidateIsHere
   ) {
      return IilliliilIIi(interactiveWaitHere, tempSolvableHere, dispatchableHere, anyCandidateAbove, lowestCandidateIsHere, 0);
   }

   public static IiiIIIlliiIIIl liiiIIllIl(lilililliililill tempSolvable, int c) {
      if (tempSolvable.lIiiIiIlilli() > 0) {
         return IiiIIIlliiIIIl.iIIlIliIlIlIlIliIl;
      } else if (tempSolvable.iliIiiliiiii() > 0) {
         return IiiIIIlliiIIIl.llIlIliIlilIlIliIl;
      } else if (!Iiilliilliilliil.Iliilliiilii(tempSolvable.lIiiIiIlilli(), c, tempSolvable.IIIllIIliIIl())) {
         return IiiIIIlliiIIIl.iiIlIliIlIIllIliIl;
      } else {
         return tempSolvable.IilliliilIIi() > 0 ? IiiIIIlliiIIIl.IiIlIliIlliIlIliIl : IiiIIIlliiIIIl.iiIlIliIlIIllIliIl;
      }
   }

   public static IiiIIiIlliiIIiIl IliIlllilIi(lillilIliillilIl f) {
      if (f.IliIlllilIi()) {
         return IiiIIiIlliiIIiIl.IliiiIiIll;
      } else if (f.liiiIIllIl()) {
         return IiiIIiIlliiIIiIl.llliiIiIll;
      } else if (f.IIIllIIliIIl()) {
         return IiiIIiIlliiIIiIl.lIiiiIiIll;
      } else if (f.iIlIlllllill()) {
         return IiiIIiIlliiIIiIl.illiiIiIll;
      } else if (f.IlIlllIlilIl()) {
         return IiiIIiIlliiIIiIl.iIiiiIiIll;
      } else if (f.IiIlliIliiIl()) {
         return IiiIIiIlliiIIiIl.IIiiiIiIll;
      } else if (!f.lIiiIiIlilli()) {
         return IiiIIiIlliiIIiIl.iiliiIiIll;
      } else if (f.iliIiiliiiii()) {
         return IiiIIiIlliiIIiIl.liliiIiIll;
      } else {
         return f.IilliliilIIi() ? IiiIIiIlliiIIiIl.IiliiIiIll : IiiIIiIlliiIIiIl.lIiiiIiIll;
      }
   }
}
