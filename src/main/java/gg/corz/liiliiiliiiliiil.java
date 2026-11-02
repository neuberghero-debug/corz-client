package gg.corz;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class liiliiiliiiliiil implements Executor {
   private ThreadPoolExecutor IlllilIiil;

   private liiliiiliiiliiil() {
   }

   @Override
   public synchronized void execute(Runnable job) {
      if (this.IlllilIiil == null) {
         ThreadPoolExecutor var2 = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), liiliiiliiiliiil::IliIlllilIi);
         var2.allowCoreThreadTimeOut(true);
         this.IlllilIiil = var2;
      }

      this.IlllilIiil.execute(job);
   }

   private static Thread IliIlllilIi(Runnable r) {
      Thread var1 = new Thread(r, liiiIIllIl<"liiiIIllIl","OYtA+VE8WEAjLd65XbdTz++Sk7zQYSintKO+ru/8KklvYCVzDshCjZCm">());
      var1.setDaemon(true);
      return var1;
   }
}
