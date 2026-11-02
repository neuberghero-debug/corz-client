package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class iilllIIiIIillIIi {
   private int ilIIIIiiil;
   private int IiIIIIiiil;
   private String IlIIIIiiil;
   private int llIIIIiiil;
   public static final String Iiiiiiliil = "MISSING_MATERIAL";
   public static final String iliiiiliil = "WAITING_SUPPORT";
   public static final String iIiiiiliil = "NO_ACCESS_ROUTE";
   public static final String lIiiiiliil = "DIRT_LOOP_BAN";
   private final ArrayList<Long> liIIIIiiil = new ArrayList<>();
   public static final String lliiiiliil = "POSE_BLOCKED";
   public static final String liiiiiliil = "ROI_REFUSED";
   public static final int iIIIIIiiil = 200;
   public static final String Iliiiiliil = "NO_STAND";
   public static final String IIiiiiliil = "TEMP_DEBT_NO_RECYCLE";
   public static final String iiiiiiliil = "ISOLATED_AFTER_ACCESS";
   public static final String IIIIIIiiil = "OTHER";
   public static final int lIIIIIiiil = 6;

   public void iIlIlllllill(String blocker, int tick, long targetKey) {
      if (blocker.equals(this.IlIIIIiiil)) {
         this.llIIIIiiil++;
      } else {
         this.IlIIIIiiil = blocker;
         this.llIIIIiiil = 1;
         this.ilIIIIiiil = tick;
         this.liIIIIiiil.clear();
      }

      if (targetKey != 0L && this.liIIIIiiil.size() < 16 && !this.liIIIIiiil.contains(targetKey)) {
         this.liIIIIiiil.add(targetKey);
      }
   }

   public String iliIiiliiiii(int lastProgressTick, int tick) {
      if (this.IlIIIIiiil != null && this.llIIIIiiil >= 6) {
         return lastProgressTick - tick < 200 ? null : this.IlIIIIiiil;
      } else {
         return null;
      }
   }

   public int Illlllllilll() {
      return this.IiIIIIiiil;
   }

   public void lIiiIiIlilli() {
      this.IlIIIIiiil = null;
      this.llIIIIiiil = 0;
      this.liIIIIiiil.clear();
   }

   public void IIIllIIliIIl() {
      this.IiIIIIiiil++;
      this.llIIIIiiil = 0;
      this.liIIIIiiil.clear();
   }

   public List<Long> IilliliilIIi() {
      return List.copyOf(this.liIIIIiiil);
   }

   public int IIlllIlliIll() {
      return this.ilIIIIiiil;
   }

   public void liiiIIllIl(String blocker, int tick) {
      this.iIlIlllllill(blocker, tick, 0L);
   }

   public int IiIlliIliiIl() {
      return this.llIIIIiiil;
   }

   public static String IliIlllilIi(String reason) {
      String var1 = reason == null ? "" : reason.toLowerCase(Locale.ROOT);
      if (var1.contains(Iilllilliill<"Iilllilliill","DntWz4lswdgMd3KlqjEDTgJIer2gI+iXZxkeBHwkVZ3SVmrC">())
         || var1.contains(Iilllilliill<"Iilllilliill","DYRiZDtEVMPxKr2C97xxsl5KurLu7NSBFEkKIm1svr55NgxI9A/sW7PqBGmEfw==">())
         || var1.contains(Iilllilliill<"Iilllilliill","8eXwXuvxC6alDlve3qDpsKqr8uVxCoW/+6u0J3fINEwMPUubSA==">())) {
         return Iilllilliill<"Iilllilliill","Hrz/NV9yopsdwFatdeKqNcj9sOQB73XhK3Tr3sj+e4N12ClLRm3HukGhtGD0bJmu">();
      } else if (var1.contains(Iilllilliill<"Iilllilliill","lHgSR6CJGW4es9HcaWESb3WENCyHYLnNkbbAVnbqOsyTTdGihQ==">())) {
         return Iilllilliill<"Iilllilliill","EBwHFOH4xuz9nzajmzwQNarF1UDywBbhJgWdkYoCWfi5SGXAj6v9qmU=">();
      } else if (var1.contains(Iilllilliill<"Iilllilliill","fFfSKVN+gGpmwG3m1I5H+j6bDscy1DnVw8n24Narx2NuOTcUNzFN1d6Q">())) {
         return Iilllilliill<"Iilllilliill","Go+o495A3Oy/ZCPM5y87dZ1ThHQ7uu+6xdI5zOWZNjm/90VY3Az4">();
      } else if (var1.contains(Iilllilliill<"Iilllilliill","vmvKLosSOkbJCMjgByKqhM8WkO6SSxXxATAw7iOeGaMPfKlxqk/I5/p0rN/9nCw9gQ==">())
         || var1.contains(Iilllilliill<"Iilllilliill","QsAQ7rRY8GSiyWOx5KQXAe9agh4oGrL3CsAg40PBnt6xg8a1">())) {
         return Iilllilliill<"Iilllilliill","Lq7wP0oyz10z8w/gGQw3Em44YijCz9ybhXNDaEAhzp1YfXR31evA+rXlfKBaZL5wMQ==">();
      } else if (var1.contains(Iilllilliill<"Iilllilliill","DBAGERfdsU4fQHM1vfTTScaG6cn1m402Ire+bEUKH6HEdRM=">())
         || var1.contains(Iilllilliill<"Iilllilliill","zBRvB8tvA063BDJ4lT3riGQFM5f+umCX53tb4JgHPNqQog==">())
         || var1.contains(Iilllilliill<"Iilllilliill","2CGjRBqBLMLcLscQ2Dng3dPhqyYgAUbGoXhzd1+deq86pg==">())) {
         return Iilllilliill<"Iilllilliill","NyRyINwX0FUN8dXOJurPs4Dp8aCtod0wPaSK9n0Kv4t9ciQ1/YbM/77M3w==">();
      } else if (var1.contains(Iilllilliill<"Iilllilliill","stdNB4QJ/NVQqQDmvrFIs16kCEubuGeoeCLFoT7/mw==">())
         || var1.contains(Iilllilliill<"Iilllilliill","DiMVIFYAJUut0mgynixTIKPZnMoh79qCXfnPhdpadzw=">())
         || var1.contains(Iilllilliill<"Iilllilliill","kyPA7i+mvKIiXPuPYSWvi4wy1nqvMlSq2GWDAWjKGLsOCw==">())) {
         return Iilllilliill<"Iilllilliill","cA+m4LzQlDCnttoHtyTq2dQ0iy3QcjLv3iLo6VCX8z1vJm+awc9lKA==">();
      } else if (var1.contains(Iilllilliill<"Iilllilliill","RYO/xFLzLmF0/Np95N98MyFRVoXUsVRB/VTGW/wLl2Q2">())) {
         return Iilllilliill<"Iilllilliill","ai+L0CZQr3iesG4ViR904XzTt8zFpkFMB+PtO8kzinDDZR/9">();
      } else if (var1.contains(Iilllilliill<"Iilllilliill","dxEcCn0eY2qSkJje9ffyA1Ep39TvcDWwg9PpifLlVw3YeFI=">())
         || var1.contains(Iilllilliill<"Iilllilliill","xhM4imYZMuhN85Br8/3IvvmoBc0y5xO9QAruMn2Q4cNNTSWvVvEN">())) {
         return Iilllilliill<"Iilllilliill","AkxAVpx85ZPbXfOUCgxR1vKAVjKrca+OfVIk0buE9HhGouL7rHHzaDm/+A==">();
      } else {
         return var1.contains(Iilllilliill<"Iilllilliill","VvpVPMDZB5bhnkcBy+Tqa+Ve4rvC5asW5nMqFv4is2gVKdXD">())
            ? Iilllilliill<"Iilllilliill","amrfnoo5jeHtWDBWxcU6KBDh5wagkfcRdvMJXpJJ60alm7on0PrVhY7T98I=">()
            : Iilllilliill<"Iilllilliill","yj0T2lDJ5LNOegpRNuI6Jr5MyFsyfpblnuktBpYtr3IG">();
      }
   }

   public String IlIlllIlilIl() {
      return this.IlIIIIiiil;
   }
}
