package gg.corz;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;

public final class liIIiIiiiIIiIi {
   private final LinkedHashMap<Long, IiIIIlllliIIIlll> IiIillliiliIilllii = new LinkedHashMap<Long, IiIIIlllliIIIlll>(64, 0.75F, false) {
      @Override
      protected boolean removeEldestEntry(Entry<Long, IiIIIlllliIIIlll> e) {
         return this.size() > 8192;
      }
   };
   private static final String[] IIIillliilIIilllii = new String[]{
      IIIilIIiiIIi<"IIIilIIiiIIi","wHvkoTLGj9kq4DzRd8xAEiXQ1ziR30K+83gaPH/NKqZtnsM=">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","4KLWpOD5D283oqX8ZI/CsmSWGVF28gNh/RIsUu+XE2xhTFQ9Aw==">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","z8Y0Ys6udowcwf07mpKagjtW2NX1ftJcdqIwzJZE+LXrPX33">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","yo5K3Od8mqAClFoNEySA1fYxqUwEBBDalQRJKRxuqC/1GC1JAuxlDtSorXCGVw==">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","5l8cslEkGlyNm6VmgWPH0+9K2NpZyr3IfT+s131LApCKDuOuLZ83">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","/l5qoHvWHq1G21/VXaWXKd6uHnE0+tznD2Llm+H6nCN4IYt+ve3W4rcNpQ==">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","EHjHiY5I7VfYQgHS9upXngtb5L8ehLVmny5W3cr/S2WGCkfaapN5fmj/IgW9YVGXCw==">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","s4uD6G5vya5wrgE/mGcUmtlyeYokTL5BLGjmOcpdEO/WZZH9UhFxgho1ssvbzQ==">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","Mg+VJsXcSCLXLPUXD970qy0KtaJUnovVyZqPLL6yWBY5mFadH9KrRQ/8V48d84Tz">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","nNRfElRt7S+q+cf+slsS3DLhzhmaBqrv7/M4ng4kqWeJB1+UARkXFmjjyDFAH/vn1S/yQ9ONAsA=">()
   };
   private IlilIIilllilIIil Illillliilllilllii;
   private int lIlillliiiIlilllii;
   private static final String[] llIillliiilIilllii = new String[]{
      IIIilIIiiIIi<"IIIilIIiiIIi","LbRAYGpLoFO94xNbqiFPTO/yZJqd9SHCUiA7sF89ag==">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","kJEArcb4kXrUsx9UX6RwRXE4t7adUfmzFnU55a+J4icMEvCEBNA=">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","EOIX+VRP5IR6LquctRSXUixXgggBGV5pQsLHNWtbcohrbYQM">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","fRzGA91Qe7cnWaOmYf3Qo8xbtw6rpEJAdA7XYO7/V0ufr3DIZA==">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","QRIQ+C3R1q/ys6OXLk11wi44pTIf+tclziLEAW3bqQ0lQY0Csw==">()
   };
   public static final int liilllliiiiillllii = 8192;
   private static final String[] iIIillliiIlIilllii = new String[]{
      IIIilIIiiIIi<"IIIilIIiiIIi","tb9+NVwniatOhfHPLR/1j/iI3TB7dTc3aoZKKbk64Hei7r2+">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","7lY+KVSyr/kJ5EUSxc6XEmZghC8W5ABtWSrPXcRgQTnfgg==">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","IboY5kwKREhZXe+L2+TpddcukbA3Ts1KnRYN48UnWoYJZq4V">(),
      IIIilIIiiIIi<"IIIilIIiiIIi","GpfTJt8Bn4OpU4J1fKM2GVF4aTwwkk62BxbzFjG79sitIHKobDYkZ14a9JZx">()
   };
   private int iiIillliiIIlilllii;

   public int IIillIiliIil() {
      return this.IiIillliiliIilllii.size();
   }

   public boolean IlIlllIlilIl(long target) {
      return this.IiIillliiliIilllii.containsKey(Long.valueOf(target));
   }

   public int Iilllilliill() {
      return this.lIlillliiiIlilllii;
   }

   public IlilIIilllilIIil IIlllIlliIll() {
      return this.Illillliilllilllii;
   }

   public static IlilIIilllilIIil IliIlllilIi(IiIIIlllliIIIlll tick, int geometryNow, int floorTicks, long componentNow, long deferred) {
      if (tick == null) {
         return IlilIIilllilIIil.lIIlllIIil;
      } else if (componentNow != tick.liiiIIllIl()) {
         return IlilIIilllilIIil.iiiIllIIil;
      } else if (deferred != tick.iIlIlllllill()) {
         return IlilIIilllilIIil.IIIlllIIil;
      } else if (tick.IilliliilIIi() == lIlIliIlIl.IlIlIIlllIlIIl) {
         return IlilIIilllilIIil.iIIlllIIil;
      } else {
         return geometryNow - tick.IliIlllilIi() < floorTicks ? IlilIIilllilIIil.IlIlllIIil : IlilIIilllilIIil.lIIlllIIil;
      }
   }

   public void Ililllililil() {
      this.IiIillliiliIilllii.clear();
      this.iiIillliiIIlilllii = 0;
      this.lIlillliiiIlilllii = 0;
      this.Illillliilllilllii = null;
   }

   public static boolean liiiIIllIl(IlilIIilllilIIil v) {
      return v == IlilIIilllilIIil.iiiIllIIil || v == IlilIIilllilIIil.IIIlllIIil || v == IlilIIilllilIIil.lIIlllIIil;
   }

   public IlilIIilllilIIil IiIlliIliiIl(long target, int geometryNow, int componentNow, long tick, long floorTicks) {
      IlilIIilllilIIil var9 = IliIlllilIi(this.IiIillliiliIilllii.get(target), geometryNow, componentNow, tick, floorTicks);
      if (liiiIIllIl(var9)) {
         this.lIlillliiiIlilllii++;
      } else {
         this.iiIillliiIIlilllii++;
      }

      this.Illillliilllilllii = var9;
      return var9;
   }

   public String Iiilliiliiil() {
      return String.format(
         Locale.ROOT,
         IIIilIIiiIIi<"IIIilIIiiIIi","D3LfeDWF10Cy5drd9fNKibnwIrHpPIazYZZoqP1uwkldA6Wfc1szyUst6xo+klNoCh9sLNknfJt78M+BGA8b7MiQTA==">(),
         this.IiIillliiliIilllii.size(),
         this.iiIillliiIIlilllii,
         this.lIlillliiiIlilllii,
         this.Illillliilllilllii == null ? IIIilIIiiIIi<"IIIilIIiiIIi","kdeb7WU/PbXbV7rrI7jTbNMrP/WsfQcpAYr6jkLYUjM=">() : this.Illillliilllilllii
      );
   }

   public static lIlIliIlIl iIlIlllllill(String reason) {
      if (reason == null) {
         return lIlIliIlIl.liIlIIliiIlIIl;
      } else {
         String var1 = reason.toLowerCase(Locale.ROOT);
         if (IilliliilIIi(var1, IIIillliilIIilllii)) {
            return lIlIliIlIl.IlIlIIlllIlIIl;
         } else if (IilliliilIIi(var1, iIIillliiIlIilllii)) {
            return lIlIliIlIl.ilIlIIlIiIlIIl;
         } else {
            return IilliliilIIi(var1, llIillliiilIilllii) ? lIlIliIlIl.IIllIIllIllIIl : lIlIliIlIl.liIlIIliiIlIIl;
         }
      }
   }

   public int Illlllllilll() {
      return this.iiIillliiIIlilllii;
   }

   private static boolean IilliliilIIi(String words, String[] s) {
      long var6 = 4879447485765769449L;
      String[] var2 = s;
      var6 ^= ((long)s.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         String var5 = var2[(int)var9];
         if (words.contains(var5)) {
            return true;
         }
      }

      return false;
   }

   public IiIIIlllliIIIlll iliIiiliiiii(long target) {
      return this.IiIillliiliIilllii.get(target);
   }

   public void lIiiIiIlilli(long s, IiIIIlllliIIIlll target) {
      if (target == null) {
         this.IiIillliiliIilllii.remove(Long.valueOf(s));
      } else {
         this.IiIillliiliIilllii.remove(Long.valueOf(s));
         this.IiIillliiliIilllii.put(Long.valueOf(s), target);
      }
   }

   public void IIIllIIliIIl(long target) {
      this.IiIillliiliIilllii.remove(Long.valueOf(target));
   }
}
