package com.corz.client.qvm;

import java.io.File;
import java.io.InputStream;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public final class Runtime {
   public static Object conv(Object var0, Class var1) {
      if (var0 != null && var0 instanceof Integer) {
         if (var1 == boolean.class || var1 == Boolean.class) {
            if ((Integer)var0 != 0) {
               return Boolean.TRUE;
            }

            return Boolean.FALSE;
         }

         if (var1 == char.class || var1 == Character.class) {
            return (char)((Integer)var0).intValue();
         }

         if (var1 == byte.class || var1 == Byte.class) {
            return (byte)((Integer)var0).intValue();
         }

         if (var1 == short.class || var1 == Short.class) {
            return (short)((Integer)var0).intValue();
         }
      }

      return var0;
   }

   public static int ex(int[] var0, Object[] var1, Throwable var2, int var3) {
      StackTraceElement[] var4 = var2.getStackTrace();
      ArrayList var5 = new ArrayList();

      for (int var6 = 0; var6 < var4.length; var6++) {
         StackTraceElement var7 = var4[var6];
         String var8 = var7.getClassName();
         if (!var8.contains("com.corz.client.qvm.Runtime") && !var8.contains("java.lang.invoke.MethodHandle")) {
            var5.add(var7);
         }
      }

      var2.setStackTrace(var5.toArray(new StackTraceElement[0]));
      byte var12 = 0;

      int var15;
      while (true) {
         if (var12 >= var0.length) {
            return -1;
         }

         int var13 = var0[var12];
         int var14 = var0[var12 + 1];
         var15 = var0[var12 + 2];
         int var16 = var0[var12 + 3];
         if (var3 >= var13 && var3 < var14) {
            if (var16 == -1) {
               break;
            }

            try {
               String var9 = ((String)cp(var1, var16)).replace('/', '.');
               Class var10 = Class.forName(var9, false, Runtime.class.getClassLoader());
               if (var10.isInstance(var2)) {
                  break;
               }
            } catch (ClassNotFoundException var11) {
            }
         }

         var12 += 4;
      }

      return var15;
   }

   private static native Object res(String var0, Object var1);

   private static native Method lookupM(Class var0, String var1, Class[] var2);

   public static long toLong(Object var0) {
      return var0 instanceof Number ? ((Number)var0).longValue() : 0L;
   }

   static {
      if (System.getProperty("java.runtime.name", "").toLowerCase().contains("android")) {
         System.loadLibrary("vm");
      } else {
         String var0 = System.getProperty("os.name").toLowerCase();
         String var1 = System.getProperty("os.arch").toLowerCase();
         StringBuilder var10000 = new StringBuilder("native/");
         var10000 = !var0.contains("win") ? (!var0.contains("mac") ? var10000.append("linux-") : var10000.append("macos-")) : var10000.append("windows-");
         var10000 = !var1.contains("aarch64") && !var1.contains("arm64") ? var10000.append("x86_64/") : var10000.append("aarch64/");
         String var2 = (!var0.contains("win")
               ? (!var0.contains("mac") ? var10000.append("libvm.so") : var10000.append("libvm.dylib"))
               : var10000.append("vm.dll"))
            .toString();
         InputStream var3 = Runtime.class.getResourceAsStream(var2);
         File var4 = File.createTempFile("qvm", !var0.contains("win") ? (!var0.contains("mac") ? ".so" : ".dylib") : ".dll");
         var4.deleteOnExit();
         Files.copy(var3, var4.toPath(), StandardCopyOption.REPLACE_EXISTING);
         System.load(var4.getAbsolutePath());
      }
   }

   public static int toInt(Object var0) {
      if (var0 instanceof Integer) {
         return (Integer)var0;
      } else if (var0 instanceof Character) {
         return (Character)var0;
      } else {
         if (var0 instanceof Boolean) {
            if ((Boolean)var0) {
               return 1;
            }
         } else if (var0 instanceof Number) {
            return ((Number)var0).intValue();
         }

         return 0;
      }
   }

   private static native String str(String var0);

   public static float toFloat(Object var0) {
      return var0 instanceof Number ? ((Number)var0).floatValue() : 0.0F;
   }

   public static native void loadVm(Class var0, Lookup var1);

   public static native Object run(long var0, int var2, Object[] var3);

   public static double toDouble(Object var0) {
      return var0 instanceof Number ? ((Number)var0).doubleValue() : 0.0;
   }

   private static Object cp(Object[] var0, int var1) {
      return var0[var1] instanceof String ? str((String)var0[var1]) : var0[var1];
   }
}
