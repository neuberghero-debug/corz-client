package gg.corz;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public final class lIIlllIliIIlllIl {
   public static iiIillIlIIlillIl IliIlllilIi(
      lIIiiiiIIiii otherMissionOwns,
      ilIililIiIilil cap,
      int entryFailedContext,
      int recentExit,
      int horizon,
      int radius,
      lliiiliiliiili cz,
      boolean p,
      boolean cx,
      boolean stats,
      boolean enabled
   ) {
      return liiiIIllIl(otherMissionOwns, cap, entryFailedContext, recentExit, horizon, radius, cz, p, cx, stats, d -> enabled);
   }

   public static iiIillIlIIlillIl iIlIlllllill(
      lIIiiiiIIiii otherMissionOwns,
      ilIililIiIilil p,
      int radius,
      int cz,
      int cap,
      int entryGate,
      lliiiliiliiili enabled,
      boolean recentExit,
      boolean cx,
      boolean horizon,
      Function<Iiilliiliiil, Iiiiilllliiiilll> stats
   ) {
      iiIillIlIIlillIl var11 = IilliliilIIi(otherMissionOwns, p, radius, cz, cap, entryGate, enabled, recentExit, cx, horizon, stats);
      if (enabled != null) {
         enabled.liiiIIllIl(var11);
      }

      return var11;
   }

   private static iiIillIlIIlillIl IilliliilIIi(
      lIIiiiiIIiii enabled,
      ilIililIiIilil otherMissionOwns,
      int stats,
      int entryGate,
      int cz,
      int p,
      lliiiliiliiili recentExit,
      boolean radius,
      boolean horizon,
      boolean cap,
      Function<Iiilliiliiil, Iiiiilllliiiilll> cx
   ) {
      long var21 = 5914044292333422497L;
      long var23 = -7349614420975896388L;
      long var25 = 2440844262951985437L;
      if (!radius) {
         return new iiIillIlIIlillIl(
            Iiiiilllliiiilll.iiiIlllill,
            Integer.MIN_VALUE,
            null,
            null,
            IlIlllIlilIl<"IlIlllIlilIl","KDyGDqoIjemQ770Xd0WvaOvsF3dMEVgDm3vB5SfdXiAG6IoEB7fReB8=">()
         );
      } else if (horizon) {
         return new iiIillIlIIlillIl(
            Iiiiilllliiiilll.liIllllill,
            Integer.MIN_VALUE,
            null,
            null,
            IlIlllIlilIl<"IlIlllIlilIl","IAW5sY4cdOudCT4U0tKY3S9TtNNg/gTYBVg7iWuFIyZjrEd2i4auZGkVn8iJTS2hGlfsZsF8r/wo2kDvpPQ=">()
         );
      } else {
         List var11 = otherMissionOwns == null ? List.of() : otherMissionOwns.IilliliilIIi();
         if (var11.isEmpty()) {
            return new iiIillIlIIlillIl(
               Iiiiilllliiiilll.IIIllllill,
               Integer.MIN_VALUE,
               null,
               null,
               IlIlllIlilIl<"IlIlllIlilIl","/nA2Gbsxk+cPzMEZKhUEIxlKQHfoA8w/CjyuslJ100yHhLRXElrdYkozlJpe0g==">()
            );
         } else {
            iIlillIllill var12 = null;
            var21 ^= (Long.MIN_VALUE ^ var21) & -1L << 32;
            var21 ^= ~var21 & -1L >>> 32;
            iIlillIllill var15 = null;
            var23 ^= (Long.MIN_VALUE ^ var23) & -1L << 32;
            Iterator var17 = var11.iterator();

            while (var17.hasNext()) {
               var23 ^= ((long)((Integer)var17.next()).intValue() ^ var23) & -1L >>> 32;
               iIlillIllill var19 = iIiIilIiIliIilIi.lIiiIiIlilli(enabled, (int)var23, stats, entryGate, cz, p);
               if (var19.liliilIiiiliilIi != null && var19.liliilIiiiliilIi.IliIlllilIi()) {
                  if (recentExit != null) {
                     recentExit.llllIllIIl++;
                  }

                  var25 ^= ((long)(var19.liliilIiiiliilIi.IilliliilIIi() * 4 + Math.min(var19.liliilIiiiliilIi.IlIIllllIIll, 400)) << 32 ^ var25) & -1L << 32;
                  if ((int)(var25 >>> 32) > (int)var21) {
                     var21 ^= ((long)((int)(var25 >>> 32)) ^ var21) & -1L >>> 32;
                     var12 = var19;
                     var21 ^= ((long)((int)var23) << 32 ^ var21) & -1L << 32;
                  }
               }

               if (var15 == null || lIiiIiIlilli(var19) > lIiiIiIlilli(var15)) {
                  var15 = var19;
                  var23 ^= ((long)((int)var23) << 32 ^ var23) & -1L << 32;
               }
            }

            if (var12 == null) {
               Iiiiilllliiiilll var18 = var15.llIiilIiilIiilIi == 0
                  ? Iiiiilllliiiilll.lIIllllill
                  : (
                     var15.IiIiilIiliIiilIi == 0
                        ? Iiiiilllliiiilll.iIIllllill
                        : (
                           var15.liliilIiiiliilIi == null
                              ? Iiiiilllliiiilll.lIIllllill
                              : (var15.liliilIiiiliilIi.IilliliilIIi() == 0 ? Iiiiilllliiiilll.IlIllllill : Iiiiilllliiiilll.llIllllill)
                        )
                  );
               return new iiIillIlIIlillIl(
                  var18,
                  (int)(var23 >>> 32),
                  null,
                  var15,
                  IlIlllIlilIl<"IlIlllIlilIl","MaqT4teRJtJrJ00ZVDHRuzP0G77FGBxyzl37028ii0/plg==">()
                     + (int)(var23 >>> 32)
                     + IlIlllIlilIl<"IlIlllIlilIl","gVNYKFoy18fe3+hHrccp5PKoukjEMoEcB4pGW7an">()
                     + var15.IliIlllilIi()
               );
            } else if (cap) {
               return new iiIillIlIIlillIl(
                  Iiiiilllliiiilll.iiIllllill,
                  (int)(var21 >>> 32),
                  null,
                  var12,
                  IlIlllIlilIl<"IlIlllIlilIl","Wn+ZHne3bhqvT2whHrpWQ3UxWlit3sgN2tudqUcIKVxHVqL0Vod+YaapOECsZg==">()
               );
            } else {
               if (!var12.liliilIiiiliilIi.iIlIlllllill(llIiIiililIiIiil.IIIllIIliIIl(stats, otherMissionOwns.IiIlliIliiIl(), entryGate))) {
                  Iiiiilllliiiilll var27 = (Iiiiilllliiiilll)cx.apply(var12.liliilIiiiliilIi);
                  if (var27 == null) {
                     var27 = Iiiiilllliiiilll.liiIlllill;
                  }

                  if (var27 == Iiiiilllliiiilll.iIlllllill) {
                     return new iiIillIlIIlillIl(
                        var27,
                        (int)(var21 >>> 32),
                        var12.liliilIiiiliilIi,
                        var12,
                        IlIlllIlilIl<"IlIlllIlilIl","2hkGGe+kcwquYnK9h+cUYYHN3t7dDDptxZGyhC3sGfxKG0ySUZF1uivVa/vqsP5A8s4nmelOSCYqGsU6W1vTDzclfc4=">()
                     );
                  }

                  if (var27 != Iiiiilllliiiilll.liiIlllill) {
                     return new iiIillIlIIlillIl(
                        var27,
                        (int)(var21 >>> 32),
                        null,
                        var12,
                        var27 == Iiiiilllliiiilll.IIlllllill
                           ? IlIlllIlilIl<"IlIlllIlilIl","ZmUffxFYNvUDo1LXAeyQnyN23ThDROIi9Uy3rhXMBnf4epWaaEKd+zhGup2zefvEoTRdUgHQDPY=">()
                           : var27.name().toLowerCase(Locale.ROOT).replace('_', ' ')
                     );
                  }
               }

               return new iiIillIlIIlillIl(
                  Iiiiilllliiiilll.liiIlllill,
                  (int)(var21 >>> 32),
                  var12.liliilIiiiliilIi,
                  var12,
                  IlIlllIlilIl<"IlIlllIlilIl","MaqT4teRJtJrJ00ZVDHRuzP0G77FGBxyzl37028ii0/plg==">()
                     + (int)(var21 >>> 32)
                     + IlIlllIlilIl<"IlIlllIlilIl","gVNYKFoy18fe3+hHrccp5PKoukjEMoEcB4pGW7an">()
                     + var12.IliIlllilIi()
               );
            }
         }
      }
   }

   private static int lIiiIiIlilli(iIlillIllill r) {
      if (r.liliilIiiiliilIi != null && r.liliilIiiiliilIi.IilliliilIIi() > 0) {
         return 4;
      } else if (r.liliilIiiiliilIi != null) {
         return 3;
      } else if (r.IiIiilIiliIiilIi > 0) {
         return 2;
      } else {
         return r.llIiilIiilIiilIi > 0 ? 1 : 0;
      }
   }

   private lIIlllIliIIlllIl() {
   }

   public static iiIillIlIIlillIl liiiIIllIl(
      lIIiiiiIIiii horizon,
      ilIililIiIilil stats,
      int recentExit,
      int entryFailed,
      int cx,
      int p,
      lliiiliiliiili radius,
      boolean otherMissionOwns,
      boolean cz,
      boolean enabled,
      Predicate<Iiilliiliiil> cap
   ) {
      return iIlIlllllill(
         horizon,
         stats,
         recentExit,
         entryFailed,
         cx,
         p,
         radius,
         otherMissionOwns,
         cz,
         enabled,
         entryFailedx -> cap.test(entryFailedx) ? Iiiiilllliiiilll.IIlllllill : Iiiiilllliiiilll.liiIlllill
      );
   }
}
