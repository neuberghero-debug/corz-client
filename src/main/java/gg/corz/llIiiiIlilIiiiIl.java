package gg.corz;

import java.util.Objects;
import java.util.Set;
import java.util.function.LongPredicate;

public final class llIiiiIlilIiiiIl {
   private llIiiiIlilIiiiIl() {
   }

   public static lIiIIlliIiIIll IliIlllilIi(Set<Long> owned, LongPredicate stillConfirmedOwnedDirt) {
      long var3 = -7657370075299464503L;
      Objects.requireNonNull(owned, iIlIlllllill<"iIlIlllllill","E6vffDZoqSky4Xgej6EFrgBLQFnsnH3LmHjjs+d90oHr">());
      Objects.requireNonNull(stillConfirmedOwnedDirt, iIlIlllllill<"iIlIlllllill","H3Gn9be992DKqt0sw0ke/KQZloa0q4IqiMmXVA+XJGQ7esJUbYPsvGZMf2ytfds9guMP">());
      var3 ^= ((long)owned.size() << 32 ^ var3) & -1L << 32;
      owned.removeIf(cell -> !stillConfirmedOwnedDirt.test(cell));
      return new lIiIIlliIiIIll((int)(var3 >>> 32), owned.size(), (int)(var3 >>> 32) - owned.size());
   }
}
