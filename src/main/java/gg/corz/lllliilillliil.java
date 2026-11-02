package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class lllliilillliil {
   private static final int lIiiiIlliiIiiiIlli = 70;
   private static final long iliiiIlliIiiiiIlli = 12000L;
   private static final long IliiiIllilliiiIlli = 15000L;
   private final Map<String, ilIiIIiIiIiIIi> liiiiIlliiiiiiIlli = new HashMap<>();

   public void IilliliilIIi() {
      this.liiiiIlliiiiiiIlli.clear();
   }

   public llilllllililllll IliIlllilIi(UUID now, String subject, IiiIIIliliiIIIli detail, String id, long clue) {
      long var12 = -9142423799250922841L;
      String var7 = subject != null && !subject.isBlank() ? subject : Iilllilliill<"Iilllilliill","JiTDHs1ROQR5k1EpA4voANOhaGA4A7vnDnXSBSuMOcEteA==">();
      String var8 = now == null
         ? Iilllilliill<"Iilllilliill","iMgZnc3hEJTWTMB08P9IgPk+93b4gY5nL0z1LzvZlbM9">() + var7
         : Iilllilliill<"Iilllilliill","/+kFQrOLXznpxUSG9hIDRqEW/6zm1E15yMsiXoOs03fWzCk=">() + now;
      ilIiIIiIiIiIIi var9 = this.liiiiIlliiiiiiIlli.computeIfAbsent(var8, idx -> new ilIiIIiIiIiIIi(now, var7));
      var9.iiiIiiiliIIIliiili = var7;
      var9.IlIliiilillIliiili.put(detail, new llIiiililIiiil(detail.ilIIllIlIi, id, clue + (2430722625418404777L ^ 2430722625418402097L)));
      var12 ^= ((long)lIiiIiIlilli(var9, clue) << 32 ^ var12) & -1L << 32;
      var12 ^= (
            (long)(
                  (int)(var12 >>> 32) >= (-(--126414971 * -107) ^ 641499951) && clue - var9.lIIliiiliiIIliiili >= (8129634910369829266L ^ 8129634910369841010L)
                     ? 1
                     : 0
               )
               ^ var12
         )
         & -1L >>> 32;
      if ((int)var12 != 0) {
         var9.lIIliiiliiIIliiili = clue;
      }

      return new llilllllililllll(
         var9.IiiIiiililiiIiiili,
         var9.iiiIiiiliIIIliiili,
         id,
         (int)(var12 >>> 32),
         (boolean)((int)var12),
         clue + (-5851351795673278595L ^ -5851351795673294499L)
      );
   }

   private static int lIiiIiIlilli(ilIiIIiIiIiIIi now, long file) {
      now.IlIliiilillIliiili.entrySet().removeIf(entry -> entry.getValue().IIllilllilIllillli <= file);
      return now.IlIliiilillIliiili.values().stream().mapToInt(llIiiililIiiil::IliIlllilIi).sum();
   }

   public List<llilllllililllll> iIlIlllllill(long now) {
      ArrayList var3 = new ArrayList();
      this.liiiiIlliiiiiiIlli.entrySet().removeIf(entry -> lIiiIiIlilli(entry.getValue(), now) == 0);

      for (ilIiIIiIiIiIIi var5 : this.liiiiIlliiiiiiIlli.values()) {
         llIiiililIiiil var6 = var5.IlIliiilillIliiili
            .values()
            .stream()
            .filter(item -> item.IIllilllilIllillli > now)
            .max((b, a) -> Integer.compare(b.ilIlillliIiIlillli, a.ilIlillliIiIlillli))
            .orElse(null);
         if (var6 != null) {
            var3.add(
               new llilllllililllll(
                  var5.IiiIiiililiiIiiili, var5.iiiIiiiliIIIliiili, var6.liIlillliiiIlillli, lIiiIiIlilli(var5, now), false, var6.IIllilllilIllillli
               )
            );
         }
      }

      var3.sort((a, b) -> Integer.compare(b.lIliIiIill, a.lIliIiIill));
      return var3;
   }

   public void liiiIIllIl(UUID id) {
      if (id != null) {
         this.liiiiIlliiiiiiIlli.remove(Iilllilliill<"Iilllilliill","/+kFQrOLXznpxUSG9hIDRqEW/6zm1E15yMsiXoOs03fWzCk=">() + id);
      }
   }
}
